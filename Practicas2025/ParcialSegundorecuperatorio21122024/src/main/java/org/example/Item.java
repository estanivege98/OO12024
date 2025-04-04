package org.example;

public class Item {
    private String nombre;
    private double precioUnitario;
    private int cant;

    public Item(String nombre, double precioUnitario, int cant) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cant = cant;
    }

//    public void sumarItem(){
//        this.cant++;
//    }

    public double precioFinal() {
        return precioUnitario * cant;
    }
}
