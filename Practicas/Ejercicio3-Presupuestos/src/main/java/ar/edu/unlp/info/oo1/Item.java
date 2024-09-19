package ar.edu.unlp.info.oo1;

public class Item{
    private String detalle;
    private int cantidad;
    private double costoUnitario;

    public Item(String detalle, int cantidad, double costoUnitario) {
        this.detalle = detalle;
        this.costoUnitario = costoUnitario;
        this.cantidad = cantidad;
    }

    // getters
    public String getDetalle() {
        return detalle;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getCostoUnitario() {
        return costoUnitario;
    }
    public double costo() {
        return this.getCantidad() * this.getCostoUnitario();
    }

    // setters
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

}
