package org.example;

import java.time.LocalDate;

class Usuario {
    private String ID;
    private String nombre;
    private String apellido;
    private Tarjeta tarjetaCredito;
    private IAbono abono;
    private Bicicleta bicicletaEnUso;

    public Usuario(String id, String nom, String ape, Tarjeta tarjetaCredito) {
        this.ID = id;
        this.nombre = nom;
        this.apellido = ape;
        this.tarjetaCredito = tarjetaCredito;
    }

    public void retirarBicicleta(Bicicleta bicicleta) {
        if(abono.esValido()) {
            bicicletaEnUso = bicicleta;
        }
        else{
            System.out.println("No se puede retirar la bicicleta, abono no valido");
        }
    }

    public void devolverBicicleta() {
        abono.calcularCosto(LocalDate.now());
    }

    // Getters and setters


}