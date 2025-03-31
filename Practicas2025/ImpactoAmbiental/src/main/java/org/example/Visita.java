package org.example;

import java.util.List;

public abstract class Visita {
    protected String fecha;
    protected int duracion;

    public Visita(String fecha, int duracion) {
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public abstract double calcularImpactoAmbiental();

    public abstract List<Participante> listarParticipantes();
}
