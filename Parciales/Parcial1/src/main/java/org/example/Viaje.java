package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Viaje {
    private LocalDate fechaRealizacion;
    private int kmRecorridos;

    public Viaje(LocalDate fechaRealizacion, int kmRecorridos) {
        this.fechaRealizacion = fechaRealizacion;
        this.kmRecorridos = kmRecorridos;
    }

}
