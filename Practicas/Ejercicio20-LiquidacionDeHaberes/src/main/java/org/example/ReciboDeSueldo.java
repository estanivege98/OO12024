package org.example;

import java.time.LocalDate;

public class ReciboDeSueldo {
    private double sueldo;
    private int antiguedad;
    private LocalDate fechaDePago;
    private Empleado empleado;
    
    public ReciboDeSueldo(Empleado emp, double sueldoBasico, double sueldoAdicional, int antiguedad) {
        this.empleado = emp;
        this.sueldo = sueldoBasico + sueldoAdicional;
        this.antiguedad = antiguedad;
        this.fechaDePago = LocalDate.now();
    }
}
