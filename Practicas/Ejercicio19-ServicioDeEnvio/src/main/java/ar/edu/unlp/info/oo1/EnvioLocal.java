package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
    private String tipoEnvio;

    public EnvioLocal(String origen, String destino, LocalDate fechaDespacho, double pesoGramos, String tipoEnvio){
        super(origen, destino, fechaDespacho, pesoGramos);
        this.tipoEnvio = tipoEnvio;
    }

    public double costo(){
        return 0;
    }
}
