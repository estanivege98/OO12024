package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements IInversion{
     private LocalDate fechaDeConstitucion;
     private double montoDepositado;
     private double porcenajeDeInteresDiario;

     public PlazoFijo(LocalDate fecha){
            this.fechaDeConstitucion = fecha;
            this.montoDepositado = 0;
            this.porcenajeDeInteresDiario = 0;
     }

     public void setMontoDepositado(double montoDepositado){
              this.montoDepositado = montoDepositado;
     }
     public void setPorcenajeDeInteresDiario(double porcenajeDeInteresDiario){
             this.porcenajeDeInteresDiario = porcenajeDeInteresDiario;
     }
     private long calcularDias(){
                return ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now());
     }
     public double valorInversion(){
             double interes = this.montoDepositado * (this.porcenajeDeInteresDiario * this.calcularDias());
             return this.montoDepositado + interes;
     }
}
