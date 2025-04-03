package org.example;

public abstract class Bien {
    private Contribuyente contribuyente;

    public Bien(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
        contribuyente.agregarBien(this);
    }

    // Getters and setters (if needed)

    public abstract double calcularImpuesto();
}