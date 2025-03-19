package org.example;

public abstract class Producto implements IPromociones{
    private boolean retiro;
    private double precio;


    public Producto(boolean retiro, double precio) {
        this.retiro = retiro;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public double promo(){
        return 0;
    }


}
