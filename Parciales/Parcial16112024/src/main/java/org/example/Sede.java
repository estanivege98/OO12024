package org.example;

public class Sede {
    private String nombre;
    private double precioDia;
    private int cantDias;

    public Sede(String nombre, double precioDia, int cantDias) {
        this.nombre = nombre;
        this.precioDia = precioDia;
        this.cantDias = cantDias;
    }

    public double calcularCostoEstadia(){
        return this.precioDia * this.cantDias;
    }
}
