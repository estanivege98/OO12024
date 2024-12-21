package org.example;

import java.time.LocalDate;

public abstract class Evento {
    private String nombre;
    private LocalDate fecha;
    private String tema;
    private double precioInscripcion;
    private double precioRemera;

    public Evento(String nombre, LocalDate fecha, String tema, double precioInscripcion, double precioRemera) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tema = tema;
        this.precioInscripcion = precioInscripcion;
        this.precioRemera = precioRemera;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public abstract double consultarPrecioAsistencia(LocalDate fecha);

    public boolean esMismoDia(LocalDate fecha){
        return this.fecha.equals(fecha);
    }

    protected double getPrecioInscripcion() {
        return this.precioInscripcion;
    }

    protected double getPrecioRemera() {
        return this.precioRemera;
    }
}
