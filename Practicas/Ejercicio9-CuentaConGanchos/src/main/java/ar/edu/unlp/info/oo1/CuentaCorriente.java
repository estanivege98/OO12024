package ar.edu.unlp.info.oo1;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(double descubierto){
        this.descubierto = 0;
    }
    @Override
    public boolean puedeExtraer(double monto){

    }
}
