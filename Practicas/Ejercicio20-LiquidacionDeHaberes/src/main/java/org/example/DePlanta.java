package org.example;
import java.time.LocalDate;
public class DePlanta extends Contrato{
    private double sueldoMensual;
    private double montoConyuge;
    private double montoHijos;

    public DePlanta(LocalDate fechaInicio,double sueldoMensual, double montoConyuge, double montoHijos) {
        super(fechaInicio);
        this.sueldoMensual = sueldoMensual;
        this.montoConyuge = montoConyuge;
        this.montoHijos = montoHijos;
    }
    public int antiguedad(){
        return fechaInicio.until(LocalDate.now()).getYears();
    }
    public double montoBasico(){
        return sueldoMensual + montoConyuge + montoHijos;
    }
    public boolean activo(){
        return (fechaInicio.isBefore(LocalDate.now()) || fechaInicio.isEqual(LocalDate.now()));
    }
}
