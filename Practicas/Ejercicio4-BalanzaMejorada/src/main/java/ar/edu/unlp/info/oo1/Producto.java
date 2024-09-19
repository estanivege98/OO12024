package ar.edu.unlp.info.oo1;

public class Producto {
    private String descripcion;
    private double peso;
    private double precioPorKilo;

    public Producto() {
        this.descripcion = "";
        this.peso = 0;
        this.precioPorKilo = 0;
    }

    public double getPrecio() {
        return this.peso * this.precioPorKilo;
    }
    //getters
    public String getDescripcion() {
        return descripcion;
    }
    public double getPeso() {
        return peso;
    }
    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    //setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

}
