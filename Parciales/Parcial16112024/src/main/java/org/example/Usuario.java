package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Entrada> entradas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.entradas = new ArrayList<Entrada>();
    }

    public Entrada comprarEntrada(Evento evento, boolean seguro) {
        Entrada entrada = new Entrada(evento, seguro, LocalDate.now());
        this.entradas.add(entrada);
        return entrada;
    }


    public double calcularMontoPeriodo(LocalDate inicio, LocalDate fin) {
        return this.entradas.stream()
                .filter(e -> e.estaPeriodo(inicio, fin))
                .mapToDouble(e -> e.calcularPrecioEntrada())
                .sum();
    }

    public Entrada siguienteEntrada() {
        return this.entradas.stream()
                .filter(e -> e.getFechaEvento().isAfter(LocalDate.now()))
                .min((e1, e2) -> e1.getFechaEvento().compareTo(e2.getFechaEvento()))
                .orElse(null);
    }
}


