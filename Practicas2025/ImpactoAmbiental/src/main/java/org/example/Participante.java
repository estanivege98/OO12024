package org.example;

public class Participante {
    private String nombre;
    private String apellido;

    public Participante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido;
    }

}
