package org.example;
import java.time.LocalDate;
public abstract class Contrato {
    protected LocalDate fechaInicio;

    public Contrato(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    abstract double montoBasico();
    abstract int antiguedad();
    abstract boolean activo();
}
