package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class Consumo {
    private LocalDate fechaConsumo;
    private double energiaActiva;
    private double energiaReactiva;

    public Consumo(double energiaActiva, double energiaReactiva){
        this.fechaConsumo = LocalDate.now();
        this.energiaActiva = energiaActiva;
        this.energiaReactiva = energiaReactiva;
    }

    public double getEnergiaActiva(){
        return this.energiaActiva;
    }
    public double getEnergiaReactiva(){
        return this.energiaReactiva;
    }

    public double factorDePotencia(){
        return getEnergiaActiva() / Math.sqrt(Math.pow(getEnergiaActiva(), 2) + Math.pow(getEnergiaReactiva(), 2));
    }
}
