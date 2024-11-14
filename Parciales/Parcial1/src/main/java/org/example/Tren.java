package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;

public class Tren {
    private String modelo;
    private String marca;
    private String numSerie;
    private LocalDate fechaIncorporacion;
    private int kilometrajeInicial;
    private List<Tarea> tareas;
    private List<Viaje> viajes;
    private PlanMantenimiento plan;

    public Tren(String modelo, String marca, String numSerie, LocalDate fechaIncorporacion, int kilometrajeInicial) {
        this.modelo = modelo;
        this.marca = marca;
        this.numSerie = numSerie;
        this.fechaIncorporacion = fechaIncorporacion;
        this.kilometrajeInicial = kilometrajeInicial;
        //this.tareas = new LinkedList<Tarea>();
        this.viajes = new LinkedList<Viaje>();

    }

    /*public void registrarTren() {
        // Implementación del método
    }*/

    public boolean agregarPlanMantenimiento(PlanMantenimiento p) {
        if (p.getParaModelo().equals(this.modelo)) {
            this.plan = p;
            return true;
        }
        return false;
    }

    public void registrarViaje(Viaje v) {
        this.viajes.add(v);
    }

    public List<Viaje> obtenerViajes() {
        return this.viajes;
    }

    public double obtenerMontoTareas(int mes) {
        return this.plan.obtenerCosto(mes);
    }
}
