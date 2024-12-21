package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Entrada {
    private boolean seguro;
    private Evento evento;
    private LocalDate fecha;

    public Entrada(Evento evento, boolean seguro, LocalDate fecha) {
        this.evento = evento;
        this.seguro = seguro;
        this.fecha = fecha;
    }

    private double consultaSeguro(){
        return (this.seguro ? 0.15 : 0);
    }

    public LocalDate getFechaEvento() {
        return this.evento.getFecha();
    }

    public double calcularPrecioEntrada(){
        double monto = (this.seguro ? 500 : 0);
        return (this.evento.consultarPrecioAsistencia(this.fecha) + monto);
    }

    public double calcularMontoRecuperar(){
        int dias = Period.between(this.fecha, LocalDate.now()).getDays();
        double montoTotal = (dias >= 30 ? this.evento.consultarPrecioAsistencia(LocalDate.now()) * 0.50 : 0);
        return (montoTotal + montoTotal * this.consultaSeguro());
    }

    public boolean estaPeriodo(LocalDate inicio, LocalDate fin){
        return this.fecha.isAfter(inicio) && this.fecha.isBefore(fin);
    }
}
