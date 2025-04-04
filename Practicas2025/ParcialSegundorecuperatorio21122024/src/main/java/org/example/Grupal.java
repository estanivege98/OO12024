package org.example;

public class Grupal extends Plan {

    public Grupal(int cantLimite) {
        super(cantLimite);
    }

    @Override
    public double calcularPrecioBasePlan() {
        return 800 * this.getCantLimite();
    }

    private boolean mayor10(){
        return mayorQue10();
    }

    @Override
    public double montoPorPenalizacion(int cantIps) {
        if(mayor10()){
            return 0;
        }
        return (cantIps > getCantLimite()) ? ((cantIps - getCantLimite()) * 500) : 0;
    }
}