package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    public Ticket(double precioTotal, double pesoTotal, int cantidadDeProductos) {
        this.fecha = LocalDate.now();
        this.precioTotal = precioTotal;
        this.pesoTotal = pesoTotal;
        this.cantidadDeProductos = cantidadDeProductos;
    }

    // getters
    public LocalDate getFecha() {
        return fecha;
    }
    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }

    // setters
    /*public void setFecha(Date fecha) {
        this.fecha = fecha;
    }*/
    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public double impuesto(){
        return this.precioTotal * 0.21;
    }
}
