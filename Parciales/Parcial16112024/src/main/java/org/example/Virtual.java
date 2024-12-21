package org.example;

import java.time.LocalDate;

public class Virtual extends Evento{
    private double montoFijo;


    public Virtual(String nombre, LocalDate fecha, String tema, double precioInscripcion, double precioRemera, double montoFijo) {
        super(nombre, fecha, tema, precioInscripcion, precioRemera);
        this.montoFijo = montoFijo;
    }

    public double consultarPrecioAsistencia(LocalDate fecha) {
        {
            double precio = (this.getPrecioInscripcion() + this.getPrecioRemera() + this.montoFijo);
            return (this.esMismoDia(fecha) ? precio * 1.20 : precio);
        }
    }
}
