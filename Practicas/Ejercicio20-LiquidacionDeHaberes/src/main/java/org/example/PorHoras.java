package org.example;

import java.time.LocalDate;


public class PorHoras extends Contrato{
    private double valorHora;
    private int horasMes;
    private LocalDate fechaFin;

    public PorHoras(LocalDate fechaInicio, double valorHora, int horasMes, LocalDate fechaFin) {
        super(fechaInicio);
        this.valorHora = valorHora;
        this.horasMes = horasMes;
        this.fechaFin = fechaFin;
    }

    public boolean activo(){
        return (fechaFin.isAfter(LocalDate.now()) || fechaFin.isEqual(LocalDate.now()));
    }
    public int antiguedad(){
        return fechaInicio.until(LocalDate.now()).getYears();
    }

    public double montoBasico(){
        return valorHora * horasMes;
    }
}
