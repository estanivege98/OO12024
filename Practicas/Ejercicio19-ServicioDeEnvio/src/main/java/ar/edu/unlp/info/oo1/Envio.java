package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public abstract class Envio {
    protected String origen;
    protected String destino;
    protected LocalDate fechaDespacho;
    protected double pesoGramos;

    public Envio(String origen, String destino, LocalDate fechaDespacho, double pesoGramos){
        this.origen = origen;
        this.destino = destino;
        this.fechaDespacho = fechaDespacho;
        this.pesoGramos = pesoGramos;
    }

    public double getPesoGramos(){
        return this.pesoGramos;
    }
    public LocalDate getFechaDespacho(){
        return this.fechaDespacho;
    }

    abstract double costo();
}
