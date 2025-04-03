package org.example;

import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
    private String nombre;
    private Integer DNI;
    private String localidad;
    private String mail;
    private List<Bien> bienes;

    public Contribuyente(String nombre, Integer DNI, String localidad, String mail) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.localidad = localidad;
        this.mail = mail;
        this.bienes = new ArrayList<Bien>();
    }

    public void agregarBien(Bien bien) {
        this.bienes.add(bien);
    }

    public double calcularImpuesto(){
        return this.bienes.stream()
                .mapToDouble(b -> b.calcularImpuesto())
                .sum();
    }

    // Getters and setters (if needed)
}