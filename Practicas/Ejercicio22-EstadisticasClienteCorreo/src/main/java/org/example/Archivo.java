package org.example;

public class Archivo {
    private String nombre;

    public Archivo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int tamañoFile(){
        return this.getNombre().length();
    }
}