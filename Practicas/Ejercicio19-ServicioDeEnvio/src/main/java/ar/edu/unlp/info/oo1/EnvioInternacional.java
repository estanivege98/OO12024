package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {

    public EnvioInternacional(String origen, String destino, LocalDate fechaDespacho, double pesoGramos){
        super(origen, destino, fechaDespacho, pesoGramos);

    }

    public double costo(){
        return 0;
    }
    public double calcularKg(){
        return this.getPesoGramos() / 1000;
    }
}
