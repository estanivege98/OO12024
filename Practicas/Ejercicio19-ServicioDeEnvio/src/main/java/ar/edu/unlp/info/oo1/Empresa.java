package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class Empresa {

    public void enviar(Cliente cliente, Envio envio){
        cliente.getEnvios().add(envio);
    }
    public double montoAPagar(Cliente cliente, LocalDate fechaIncio, LocalDate fechaFin){
        return cliente.calcularMonto(fechaIncio, fechaFin);
    }
}
