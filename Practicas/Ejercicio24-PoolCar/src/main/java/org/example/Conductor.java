package org.example;
import java.time.LocalDate;
public class Conductor extends Usuario {
    private Vehiculo vehiculo;

    public Conductor(String nom, Vehiculo vehiculo){
        super(nom);
        this.vehiculo = vehiculo;
    }

    public Viaje registrarViaje(String origen, String destino, double costo, Vehiculo vehiculo, LocalDate fecha) {
        // Implementación del método

        Viaje viaje = new Viaje(origen, destino, costo, fecha, vehiculo);
        viaje.registrarPasajero(this);
        super.getViajes().add(viaje);
        return viaje;
    }

    @Override
    protected double calcularBonificacion() {
        return vehiculo.getValorMercado() * 0.01;
    }

    @Override
    public void cargarSaldo(double monto) {
        double comision = this.vehiculo.getAñoFabricacion() > 2019 ? 0.01 : 0.10;
        this.saldo += monto - (monto * comision);
    }
}
