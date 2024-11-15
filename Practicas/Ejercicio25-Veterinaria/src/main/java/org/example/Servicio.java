package org.example;

import java.time.LocalDate;

public abstract class Servicio implements IServicio{
    protected Veterinario veterinario;
    protected Mascota mascota;

    public Servicio(Veterinario veterinario, Mascota mascota) {
        this.veterinario = veterinario;
        this.mascota = mascota;
    }



    protected boolean esDomingo(LocalDate fechaAtencion) {
        return fechaAtencion.getDayOfWeek().getValue() == 7;
    }


}
