package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Veterinario {
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorarios;

    public Veterinario(String nombre, LocalDate fechaIngreso, double honorarios) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.honorarios = honorarios;
    }

    public double getHonorarios() {
        return honorarios;
    }

    public int getAntiguedad(){
        return LocalDate.now().getYear() - fechaIngreso.getYear();
    }

    public ConsultaMedica altaConsultaMedica(Mascota mascota){
        return new ConsultaMedica(LocalDate.now(), this, mascota);
    }

    public Vacunacion altaVacunacion(Mascota mascota, String nombreVacuna, double costoVacuna){
        return new Vacunacion(mascota, nombreVacuna, costoVacuna, this, LocalDate.now());
    }

    public Guarderia altaGuarderia(Mascota mascota, int cantidadDias){
        return new Guarderia(mascota, cantidadDias);
    }
}