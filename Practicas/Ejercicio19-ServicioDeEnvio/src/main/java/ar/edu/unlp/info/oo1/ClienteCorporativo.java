package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class ClienteCorporativo extends Cliente{
    private int CUIT;

    public ClienteCorporativo(String nombre, String direccion, int CUIT){
        super(nombre, direccion);
        this.CUIT = CUIT;
    }
    public double calcularMonto(LocalDate fechaInicio, LocalDate fechaFin){
        return super.calcularMontoPeriodo(fechaInicio, fechaFin);
    }
}
