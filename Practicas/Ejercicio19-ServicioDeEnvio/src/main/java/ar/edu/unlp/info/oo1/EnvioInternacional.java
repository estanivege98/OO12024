package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {

    public EnvioInternacional(String origen, String destino, LocalDate fechaDespacho, double pesoGramos){
        super(origen, destino, fechaDespacho, pesoGramos);

    }

    public double costo(){
        if(this.calcularKg() < 1){
            return 5000 + (10 * this.pesoGramos);
        }
        return 5000 + (25 * this.pesoGramos);
    }
    public double calcularKg(){
        return this.pesoGramos / 1000;
    }
}
