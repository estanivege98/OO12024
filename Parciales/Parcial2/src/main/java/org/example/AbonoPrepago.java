package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class AbonoPrepago implements IAbono {
    private double saldo;

    public AbonoPrepago(double saldo) {
        this.saldo = saldo;
    }

    public void cargarSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void calcularCosto(LocalDate tiempo) {
        int min = (int) ChronoUnit.MINUTES.between(tiempo, LocalDate.now());
        double resta = ((Math.floor((min) / 5 )* 50));
        saldo -= resta;
    }

    @Override
    public boolean esValido() {
        return (saldo > 0);
    }

    @Override
    public double abonoDisponible() {
        return saldo;
    }

    // Getters and setters


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
