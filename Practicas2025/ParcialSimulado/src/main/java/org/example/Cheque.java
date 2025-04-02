package org.example;

import java.time.LocalDate;

public class Cheque  extends Cobro {

    public Cheque(String originante, String destinatario, float monto, LocalDate fechaEmision){
        super(originante, destinatario, monto, fechaEmision);
    }

    private boolean pasado30Dias(){
        LocalDate fechaAct = LocalDate.now();
        LocalDate fechaInicio = fechaEmision.plusDays(30);
        return fechaAct.isAfter(fechaInicio);
    }

    public boolean estaVencido(){
        return pasado30Dias();
    }
}
