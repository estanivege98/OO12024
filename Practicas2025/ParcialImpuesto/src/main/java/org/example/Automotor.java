package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Automotor extends Vehiculo {
    private String marca;
    private String modelo;

    public Automotor(String patente, LocalDate fechaFabricacion, double valor, Contribuyente contribuyente, String marca, String modelo) {
        super(patente, fechaFabricacion, valor, contribuyente);
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters and setters (if needed)

    public double calcularImpuestoPersonal() {
        return this.getValor() * 0.05;
    }


}