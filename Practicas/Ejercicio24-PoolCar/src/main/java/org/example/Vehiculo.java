package org.example;

public class Vehiculo {
    private String descripcion;
    private int capacidad;
    private int añoFabricacion;
    private double valorMercado;

    public Vehiculo(String descripcion, int capacidad, int añoFabricacion, double valorMercado){
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.añoFabricacion = añoFabricacion;
        this.valorMercado = valorMercado;
    }
    // Getters y setters
    public int getCapacidad(){
        return this.capacidad;
    }
    public int getAñoFabricacion(){
        return this.añoFabricacion;
    }
    public double getValorMercado(){
        return this.valorMercado;
    }

}
