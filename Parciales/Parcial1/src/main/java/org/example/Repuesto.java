package org.example;

public class Repuesto {
    private String nombre;
    private double costo;

    public Repuesto(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
