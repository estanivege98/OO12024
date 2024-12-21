package org.example;

public class Mago implements IRol{
    
    public double valorBase(Personaje p){
        return (p.getInteligencia() + p.getNivel()) * 2;
    }
    public void aumentarHabilidades(Personaje p){
        p.aumentarInteligencia((3/2)*p.getNivel());
    }
}
