package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Embarcacion extends Vehiculo {
    private String nombre;

    public Embarcacion(String patente, LocalDate fechaFabricacion, double valor, Contribuyente contribuyente, String nombre) {
        super(patente, fechaFabricacion, valor, contribuyente);
        this.nombre = nombre;
    }

    // Getters and setters (if needed)

    public double calcularImpuestoPersonal(){
        return (this.getValor() > 1000000 ? this.getValor() * 0.15 : this.getValor() * 0.10);
    }
}