package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Viaje {
    private String origen;
    private String destino;
    private double costoTotal;
    private LocalDate fecha;
    private Vehiculo vehiculo;
    private List<Usuario> pasajeros;

    public Viaje(String origen, String destino, double costoTotal, LocalDate fecha, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.pasajeros = new ArrayList<Usuario>();
    }

    public void procesarViaje() {
        double costoIndividual = this.costoTotal / pasajeros.size();
        this.pasajeros.stream()
                .forEach(pasajero -> pasajero.restarCosto(costoIndividual - pasajero.calcularBonificacion()));
    }

    public void registrarPasajero(Usuario pasajero) {
        if(vehiculo.getCapacidad() > pasajeros.size() && this.fecha.minusDays(2).isBefore(LocalDate.now()) && pasajero.getSaldo() > 0) {
            this.pasajeros.add(pasajero);
        }
    }

    // Getters y setters
    public LocalDate getFecha(){
        return this.fecha;
    }
}
