package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class PersonaFisica extends Cliente{
    private int DNI;

    public PersonaFisica(String nombre, String direccion, int DNI){
        super(nombre, direccion);
        this.DNI = DNI;
    }
    public double calcularMonto(LocalDate fechaInicio, LocalDate fechaFin){
        double total = super.calcularMontoPeriodo(fechaInicio, fechaFin);
        return total - (total * 0.10);
    }
}
