package org.example;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public abstract class Tarea {
    protected double montoFijo;
    protected int idTarea;
    protected int tiempoEstimado;
    protected List<Repuesto> repuestos;
    protected LocalDate fecha;

    public Tarea(double montoFijo, int idTarea, int tiempoEstimado, LocalDate fecha) {
        this.montoFijo = montoFijo;
        this.idTarea = idTarea;
        this.tiempoEstimado = tiempoEstimado;
        this.repuestos = new LinkedList<Repuesto>();
        this.fecha = fecha;
    }

    public abstract double calcularCostoBase();
    public double calcularCostoRepuestos(){
        return this.repuestos.stream().mapToDouble(repuestos -> repuestos.getCosto()).sum();
    }
    public LocalDate getFecha(){
        return this.fecha;
    }
    public void agregarRepuesto(Repuesto r){
        this.repuestos.add(r);
    }
}
