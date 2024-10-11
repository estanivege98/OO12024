package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class Factura {
    private LocalDate fechaEmision;
    private Usuario usuario;
    private Consumo consumo;
    private double precioPorKWH;

    public Factura(Usuario user, Consumo consumo, double precioPorKWH){
        this.fechaEmision = LocalDate.now();
        this.usuario = user;
        this.consumo = consumo;
        this.precioPorKWH = precioPorKWH;
    }

    private double calcularBonificacion(){
        if(this.consumo.factorDePotencia() > 0.9){
            return 0.1;
        }
        else return 0;
    }
    private double calcularCostoConsumo(){
        return this.consumo.getEnergiaActiva() * this.precioPorKWH;
    }
    public double calcularTotal(){
        return this.calcularCostoConsumo() - this.calcularBonificacion();
    }
    public LocalDate getFechaEmision(){
        return this.fechaEmision;
    }
}
