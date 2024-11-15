package org.example;

import java.time.LocalDate;
import java.util.List;

public class TareaRodadura extends Tarea {
    private int cantKm;


    public TareaRodadura(int montoFijo, int cantKm, int idTarea, int tiempoEstimado, LocalDate fecha) {
        super(montoFijo, idTarea, tiempoEstimado, fecha);
        this.cantKm = cantKm;
    }
    @Override
    public double calcularCostoBase() {
        return this.montoFijo + this.cantKm * 0.05;
    }
}
