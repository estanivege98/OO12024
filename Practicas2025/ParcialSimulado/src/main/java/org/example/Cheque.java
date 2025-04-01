package org.example;

import java.time.LocalDate;

public class Cheque  extends Escritos{

    public Cheque(String originante, String destinatario, float monto, LocalDate fechaEmision){
        super(originante, destinatario, monto, fechaEmision);
    }

    private boolean pasado30Dias{
        if(fechaEmision.plusDays(30)){
            return true;
        }
        return false;
    }

    public boolean estaVencido(){
        return pasado30Dias;
    }
}
