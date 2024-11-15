package org.example;

import java.time.LocalDate;

public class Guarderia implements IServicio{
    private int cantidadDias;
    private Mascota mascota;
    private LocalDate inicioGuarderia;

    public Guarderia(Mascota mascota, int cantidadDias) {
        this.mascota = mascota;
        this.cantidadDias = cantidadDias;
        this.inicioGuarderia = LocalDate.now();
        this.mascota.agregarServicio(this);
    }

    public LocalDate getFecha(){
        return inicioGuarderia;
    }

    @Override
    public double calcularCosto() {
        int cantServcios = mascota.getServicios().size();
        return  (cantServcios > 5 ? (500*cantidadDias - 500*cantidadDias*0.1) : 500*cantidadDias);
    }


}
