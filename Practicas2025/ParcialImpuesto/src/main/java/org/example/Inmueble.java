package org.example;

public class Inmueble extends Bien {
    private Integer numeroPartida;
    private double valorLote;
    private double valorEdificacion;

    public Inmueble(Integer numeroPartida, float valorLote, float valorEdificacion, Contribuyente contribuyente) {
        super(contribuyente);
        this.numeroPartida = numeroPartida;
        this.valorLote = valorLote;
        this.valorEdificacion = valorEdificacion;
    }

    // Getters and setters (if needed)



    public double calcularImpuesto(){
        double valorTotal = valorLote + valorEdificacion;
        return valorTotal * 0.01; // 1% del valor total
    }
}
