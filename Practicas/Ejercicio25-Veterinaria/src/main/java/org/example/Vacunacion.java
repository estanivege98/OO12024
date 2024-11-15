package org.example;

import java.time.LocalDate;

public class Vacunacion extends Servicio{
    private String nombreVacuna;
    private double costoVacuna;
    //private Mascota mascota;
    //private Veterinario veterinario;
    private LocalDate fechaVacunacion;

    public Vacunacion(Mascota mascota, String nombreVacuna, double costoVacuna, Veterinario veterinario, LocalDate fechaVacunacion) {
        super(veterinario, mascota);
        this.nombreVacuna = nombreVacuna;
        this.costoVacuna = costoVacuna;
        this.fechaVacunacion = fechaVacunacion;
        this.mascota.agregarServicio(this);
    }

    public LocalDate getFecha(){
        return fechaVacunacion;
    }

    @Override
    public double calcularCosto(){
        return costoVacuna + veterinario.getHonorarios() + 500 + (esDomingo(fechaVacunacion) ? 200 : 0);
    }
}
