package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
    private String tipoEnvio;

    public EnvioLocal(String origen, String destino, LocalDate fechaDespacho, double pesoGramos, String tipoEnvio){
        super(origen, destino, fechaDespacho, pesoGramos);
        this.tipoEnvio = tipoEnvio;
    }
    public String getTipoEnvio(){
        return this.tipoEnvio;
    }

    public double costo(){
        if(this.tipoEnvio.equals("Entrega Rapida")){
            return 1500;
        }
        else{
            return 1000;
        }
    }
}
