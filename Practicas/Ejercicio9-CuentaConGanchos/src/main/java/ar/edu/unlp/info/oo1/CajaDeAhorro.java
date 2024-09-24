package ar.edu.unlp.info.oo1;

public class CajaDeAhorro extends Cuenta{
    double comision = 1.02;

    public CajaDeAhorro(){
        super();
    }

    @Override
    public boolean extraer(double monto){
        return super.extraer(monto * comision);
    }
    public boolean puedeExtraer(double monto){
        //double costoTotal = monto * comision;
        return this.getSaldo() - monto >= 0;
    }
    @Override
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino){
        return super.transferirACuenta(monto * comision, cuentaDestino);
    }
}
