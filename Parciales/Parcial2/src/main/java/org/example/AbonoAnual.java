package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class AbonoAnual implements IAbono {
    private LocalDate fechaInicio;
    private double montoPagado;

    public AbonoAnual(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
        this.montoPagado = 50000;
    }


    public void calcularCosto(LocalDate tiempo) {
        int min = (int)ChronoUnit.MINUTES.between(tiempo, LocalDate.now());
        double resta = ((min < 30 ) ? 0 : (Math.floor((min - 30) / 5 )* 100));
        montoPagado -= resta;
    }

    public boolean esValido() {
        return (fechaInicio.plusYears(1).isBefore(LocalDate.now()) && montoPagado > 0);
    }


    public double abonoDisponible() {
        return ChronoUnit.DAYS.between(fechaInicio, LocalDate.now());
    }

    // Getters and setters

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }
}