package ar.edu.unlp.info.oo1;

public class CajaDeAhorro extends Cuenta{
    double comision = 0.02;

    public CajaDeAhorro(double monto){
        super.depositar(monto);
    }

    @Override
    public boolean extraer(double monto){
        return super.extraer(monto + monto * comision);
    }
    public boolean puedeExtraer(double monto){
        //double costoTotal = monto * comision;
        return this.getSaldo() - monto > 0;
    }
    @Override
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino){
        return super.transferirACuenta(monto + (monto * comision), cuentaDestino);
    }
    @Override
    public void depositar(double monto){
        super.depositar(monto - (monto * comision));
    }
}
