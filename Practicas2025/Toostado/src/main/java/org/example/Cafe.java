package org.example;

public class Cafe extends Bebida{

    public Cafe(boolean retiro, double precio, boolean caliente) {
        super(retiro, precio, caliente);
    }

    public double promo(){
        if(this.esFrio()){
            return 0.1;
        }
        return 0;
    }


}
