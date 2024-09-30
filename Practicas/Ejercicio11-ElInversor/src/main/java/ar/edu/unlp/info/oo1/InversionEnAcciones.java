package ar.edu.unlp.info.oo1;

public class InversionEnAcciones implements IInversion{
    private String nombre;
    private int cantidad;
    private double valorUnitario;

    public InversionEnAcciones(String nombre){
        this.nombre = nombre;
        this.cantidad = 0;
        this.valorUnitario = 0;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }

    public double valorInversion(){
        return this.cantidad * this.valorUnitario;
    }
}
