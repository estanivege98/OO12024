package org.example;

public class Zona {
    private String nombre;
    private String descripcion;
    private boolean restringida;

    public Zona(String nombre, String descripcion, boolean restringida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.restringida = restringida;
    }

    public double esRestringida() {
        if(restringida) {
            return 100;
        } else {
            return 0;
        }
    }
}
