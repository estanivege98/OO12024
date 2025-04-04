package org.example;

public class Individual extends Plan {
    private int cantMinutos;

    public Individual(int cantMinutos) {
        super(1);
        this.cantMinutos = cantMinutos;
    }

    @Override
    public double calcularPrecioBasePlan() {
        return 20 * this.cantMinutos;
    }

    @Override
    public double montoPorPenalizacion(int cantActividades) {
        return (cantActividades > 1) ? (cantActividades * 300) : 0;
    }
}