package org.example;

import java.time.LocalDate;
import java.util.List;

public abstract class Tarea {
    protected double montoFijo;
    protected int idTarea;
    protected int tiempoEstimado;
    protected List<Repuesto> repuestos;
    protected LocalDate fecha;

    public abstract double calcularCostoBase();
    public double calcularCostoRepuestos(){
        return this.repuestos.stream().mapToDouble(repuestos -> repuestos.getCosto()).sum();
    }
    public LocalDate getFecha(){
        return this.fecha;
    }
}
