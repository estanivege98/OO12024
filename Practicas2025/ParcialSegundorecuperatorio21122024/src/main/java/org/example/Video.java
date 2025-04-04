package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Video extends Actividad {
    private int duracionPublicidad;

    public Video(LocalDate fechaInicio, String dirIp, int duracionTotal, int duracionPublicidad) {
        super(fechaInicio, dirIp, duracionTotal);
        this.duracionPublicidad = duracionPublicidad;
    }

    public int obtenerDuracionReal() {
        return getDuracionTotal() - duracionPublicidad;
    }

    @Override
    public double calcularActividad() {
        return obtenerDuracionReal() * 10;
    }
}