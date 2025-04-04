package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Cliente {
    private String nombre;
    private LocalDate fechaAlta;
    private Plan plan;
    private List<Actividad> actividades;

    public Cliente(String nombre, LocalDate fechaAlta, Plan plan) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.plan = plan;
        this.actividades = new LinkedList<Actividad>();
    }

    public void cambiarPlan(Plan plan) {
        this.plan = plan;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public double montoACobrar(LocalDate fechaFin, LocalDate fechaIni) {
        double total = this.plan.calcularPrecioBasePlan() + montoACobrarActividad(fechaFin, fechaIni) + montoPenalizacion(fechaFin, fechaIni);
        return total;
    }

    public void agregarActividad(Actividad actividad) {
        this.actividades.add(actividad);
    }



    public boolean mayorQue10(){
        return (Period.between(fechaAlta, LocalDate.now()).getYears() >= 10);
    }

    public double montoACobrarActividad(LocalDate fechaFin, LocalDate fechaIni) {
        double montoActividades = this.actividades.stream()
                .filter(a -> a.estaEnPeriodo(fechaFin, fechaIni))
                .mapToDouble(a -> a.calcularActividad())
                .sum();
        return montoActividades;
    }

    private int obtenerActividades(LocalDate fechaFin, LocalDate fechaIni) {
        Set<String> lista = this.actividades.stream()
                .filter(a -> a.estaEnPeriodo(fechaFin, fechaIni))
                .map(a -> a.getDirIp())
                .collect(Collectors.toSet());
        return lista.size();
    }

    public double montoPenalizacion(LocalDate fechaFin, LocalDate fechaIni) {
        int actividades = obtenerActividades(fechaFin, fechaIni);
        return this.plan.montoPorPenalizacion(actividades);
    }
}