package org.example;

import java.time.LocalDate;
import java.util.LinkedList;

public class ConsultaMedica extends Servicio{
    private LocalDate fechaAtencion;
    //private Veterinario veterinario;
    //private Mascota mascota;

    public ConsultaMedica(LocalDate fechaAtencion, Veterinario veterinario, Mascota mascota) {
        this.fechaAtencion = fechaAtencion;
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.mascota.agregarServicio(this);
    }

    public LocalDate getFecha(){
        return fechaAtencion;
    }

    public double calcularCosto(){
        return veterinario.getHonorarios() + 300 + (esDomingo(fechaAtencion) ? 200 : 0) + veterinario.getAntiguedad()*100;
        //return aux;
    }
}
