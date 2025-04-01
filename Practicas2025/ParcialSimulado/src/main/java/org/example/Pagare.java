package org.example;

import java.time.LocalDate;

public class Pagare extends Escritos{
    private LocalDate fechaVencimiento;

    public Pagare(String originante, String destinatario, float monto, LocalDate fechaEmision, LocalDate fechaVencimiento){
        super(originante, destinatario, monto, fechaEmision);
        this.fechaVencimiento = fechaVencimiento;
    }

    private boolean hoyOMasTarde(){
        return fechaVencimiento.isAfter(fechaEmision) || fechaVencimiento.equals(fechaEmision);
    }

    public boolean estaVencido(){
        return hoyOMasTarde();
    }
}
