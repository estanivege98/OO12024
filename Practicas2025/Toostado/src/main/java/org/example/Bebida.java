package org.example;

public abstract class Bebida extends Producto{
    private boolean caliente;

    public Bebida(boolean retiro, double precio, boolean caliente) {
        super(retiro, precio);
        this.caliente = caliente;
    }

    public double promo(){
        return 0;
    }

    public boolean esFrio(){
        return !this.caliente;
    }
}
