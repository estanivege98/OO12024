package org.example;
import java.time.LocalDate;
public abstract class Cobro {

    protected float monto;
    protected String originante;
    protected String destinatario;
    protected LocalDate fechaEmision;

    public Cobro(String originante, String destinatario, float monto, LocalDate fechaEmision){
        this.originante = originante;
        this.destinatario = destinatario;
        this.monto = monto;
        this.fechaEmision = fechaEmision;
    }

    public abstract boolean estaVencido();

    public float getMonto() {
        return monto;
    }

}
