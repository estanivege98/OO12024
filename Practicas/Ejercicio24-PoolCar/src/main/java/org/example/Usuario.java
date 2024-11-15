package org.example;

import java.util.ArrayList;
import java.util.List;


public abstract class Usuario {
    protected double saldo;
    protected String nombre;
    protected List<Viaje> viajes;

    public Usuario(String nom){
        this.saldo = 0;
        this.nombre = nom;
        this.viajes = new ArrayList<Viaje>();
    }

    protected abstract double calcularBonificacion();
    public abstract void cargarSaldo(double monto);


    public List<Viaje> getViajes() {
        return viajes;
    }
    public double getSaldo() {
        return saldo;
    }

    public void restarCosto(double costo){
        this.saldo -= costo;
    }
}
