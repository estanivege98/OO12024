package ejercicio;

import java.time.LocalDate;

public abstract class Contratacion {
    private LocalDate fecha;
    private Servicio servicio;

    public Contratacion(LocalDate fecha, Servicio servicio) {
        this.fecha = fecha;
        this.servicio = servicio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public abstract double montoAbonar();
}
