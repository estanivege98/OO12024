package org.example;

import java.time.LocalDate;

public class Pagare extends Cobro {
    private LocalDate fechaVencimiento;

    public Pagare(String originante, String destinatario, float monto, LocalDate fechaEmision, LocalDate fechaVencimiento){
        super(originante, destinatario, monto, fechaEmision);
        this.fechaVencimiento = fechaVencimiento;
    }

    private boolean hoyOMasTarde(){
        return LocalDate.now().isAfter(fechaVencimiento) || fechaVencimiento.equals(LocalDate.now());
    }

    public boolean estaVencido(){
        return hoyOMasTarde();
    }
}
