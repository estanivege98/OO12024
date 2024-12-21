package org.example;

public class Guerrero implements IRol{
    public double valorBase(Personaje p){
        return (p.getFuerza() * 2) + p.getNivel() + p.getInteligencia();
    }

    public void aumentarHabilidades(Personaje p){
        p.aumentarFuerza(p.getNivel() / 6);
    }
}
