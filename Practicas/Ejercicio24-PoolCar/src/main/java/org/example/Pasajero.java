package org.example;

import java.time.LocalDate;

public class Pasajero extends Usuario {

    public Pasajero(String nom){
        super(nom);
    }

    public boolean viajePasado() {
        return super.getViajes().size() > 0;
    }

    @Override
    public double calcularBonificacion() {
        return (this.viajePasado() ? 500 : 0);
    }

    @Override
    public void cargarSaldo(double monto) {
        Viaje vi = super.getViajes().stream()
                .filter(v -> v.getFecha().minusDays(30).isBefore(LocalDate.now()))
                .findFirst().orElse(null);
        if (vi == null){
            this.saldo += monto - (monto * 0.10);
        }
        else{
            this.saldo += monto;
        }
    }
}
