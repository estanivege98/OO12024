package org.example;

public abstract class Plan {
    private int cantLimite;
    private Cliente cliente;

    public Plan(int cantLimite) {
        this.cantLimite = cantLimite;
        //this.cliente = cliente;
    }

    public int getCantLimite() {
        return cantLimite;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean mayorQue10(){
        return this.cliente.mayorQue10();
    }

    public abstract double calcularPrecioBasePlan();

    public abstract double montoPorPenalizacion(int cantActividades);
}