package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public abstract class Vehiculo extends Bien {
    private String patente;
    private LocalDate fechaFabricacion;
    private double valor;

    public Vehiculo(String patente, LocalDate fechaFabricacion, double valor, Contribuyente contribuyente) {
        super(contribuyente);
        this.patente = patente;
        this.fechaFabricacion = fechaFabricacion;
        this.valor = valor;
    }

    private boolean mas10anios(){
        return ((ChronoUnit.YEARS.between(this.fechaFabricacion, LocalDate.now()) > 10) ? true : false);
    }

    // Getters and setters (if needed)

    public double getValor() {
        return valor;
    }

    public double calcularImpuesto(){
        return (mas10anios() ? 0 : this.calcularImpuestoPersonal());
    }

    public abstract double calcularImpuestoPersonal();

}
