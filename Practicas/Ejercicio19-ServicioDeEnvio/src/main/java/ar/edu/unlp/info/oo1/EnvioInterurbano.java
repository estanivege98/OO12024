package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
    private double distanciaKm;

    public EnvioInterurbano(String origen, String destino, LocalDate fechaDespacho, double pesoGramos, double distanciaKm){
        super(origen, destino, fechaDespacho, pesoGramos);
        this.distanciaKm = distanciaKm;
    }

    public double costo(){
        if(this.distanciaKm < 100){
            return 20 * this.pesoGramos;
        }
        if(this.distanciaKm < 500){
            return 25 * this.pesoGramos;
        }
        return 30 * this.pesoGramos;
    }
}
