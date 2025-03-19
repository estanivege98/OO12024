package org.example;

public abstract class Comida extends Producto{
    private boolean vegano;
    private boolean celiaco;

    public Comida(boolean retiro, double precio,boolean vegano, boolean celiaco) {
        super(retiro, precio);
        this.vegano = vegano;
        this.celiaco = celiaco;
    }

    public double promo(){
        return 0;
    }
}
