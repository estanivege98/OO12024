package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Envio> enviosTotales;
    
    public Empresa(){
        this.enviosTotales = new ArrayList<Envio>();
    }
    public void enviar(Cliente cliente, Envio envio){
        cliente.getEnvios().add(envio);
        this.enviosTotales.add(envio);
    }
    public double montoAPagar(Cliente cliente, LocalDate fechaIncio, LocalDate fechaFin){
        return cliente.calcularMonto(fechaIncio, fechaFin);
    }
    public List<Envio> getEnvios(){
        return this.enviosTotales;
    }
}
