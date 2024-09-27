/* Las cuentas corrientes pueden extraer aún cuando el saldo de la cuenta sea insuficiente. Sin embargo, no deben superar cierto límite por debajo del saldo. Dicho límite se conoce como límite de descubierto (algo así como el máximo saldo negativo permitido).
Ese límite es diferente para cada cuenta (lo negocia el cliente con la gente del banco).  */
package ar.edu.unlp.info.oo1;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(double monto){
        super.depositar(monto);
        this.descubierto = 0;
    }
    @Override
    public boolean puedeExtraer(double monto){
        return this.getSaldo() - monto >= -this.descubierto;
    }
    public double getDescubierto(){
        return this.descubierto;
    }
    public void setDescubierto(double descubierto){
        this.descubierto = descubierto;
    }

}
