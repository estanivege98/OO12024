package org.example;

public class TareaTiempo extends Tarea {
    private int cantDias;

    @Override
    public double calcularCostoBase() {
        return this.montoFijo /* this.cantDias*/;
    }
}
