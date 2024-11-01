package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public abstract class Envio {
    private String origen;
    private String destino;
    private LocalDate fechaDespacho;
    private double pesoGramos;

    public Envio(String origen, String destino, LocalDate fechaDespacho, double pesoGramos){
        this.origen = origen;
        this.destino = destino;
        this.fechaDespacho = fechaDespacho;
        this.pesoGramos = pesoGramos;
    }

    abstract double costo();
}
