package org.example;

import java.time.LocalDate;
import java.util.Date;

public abstract class Actividad {
    private LocalDate fechaInicio;
    private String dirIp;
    private int duracionTotal;

    public Actividad(LocalDate fechaInicio, String dirIp, int duracionTotal) {
        this.fechaInicio = fechaInicio;
        this.dirIp = dirIp;
        this.duracionTotal = duracionTotal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public String getDirIp() {
        return dirIp;
    }

    public int getDuracionTotal() {
        return duracionTotal;
    }

    public abstract double calcularActividad();

    public boolean estaEnPeriodo(LocalDate fechaFin, LocalDate fechaIni) {
        return (fechaInicio.isAfter(fechaIni) || fechaInicio.isEqual(fechaIni)) &&
                (fechaInicio.isBefore(fechaFin) || fechaInicio.isEqual(fechaFin));
    }
}