package org.example;

public class TareaRodadura extends Tarea {
    private int cantKm;

    @Override
    public double calcularCostoBase() {
        return this.montoFijo + this.cantKm * 0.05;
    }
}
