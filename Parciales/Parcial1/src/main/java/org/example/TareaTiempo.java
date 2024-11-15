package org.example;

import java.time.LocalDate;

public class TareaTiempo extends Tarea {
    private int cantDias;

    public TareaTiempo(double montoFijo, int cantDias, int idTarea, int tiempoEstimado, LocalDate fecha) {
        super(montoFijo, idTarea, tiempoEstimado, fecha);
        this.cantDias = cantDias;
    }
    @Override
    public double calcularCostoBase() {
        return this.montoFijo /* this.cantDias*/;
    }
}
