package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {
    private String nombre;
    private int nivel;
    private int inteligencia;
    private int fuerza;
    private IRol rol;
    //private List<Personaje> personajes;

    public Personaje(String nombre, int inteligencia, int fuerza, IRol rol) {
        this.nombre = nombre;
        this.inteligencia = inteligencia;
        this.fuerza = fuerza;
        this.nivel = 1;
        this.rol = rol;
    }

    protected boolean esDeDia(int momento){
        return momento >= 8 && momento <= 20;
    }

    public abstract double calcularPoderAtaque(int momento);
    public abstract void subirNivel();

    public void cambiarRol(IRol rol){
        this.rol = rol;
    }

    public int getNivel(){
        return this.nivel;
    }
    public int getInteligencia(){
        return this.inteligencia;
    }
    public int getFuerza(){
        return this.fuerza;
    }
    public IRol getRol(){
        return this.rol;
    }

    public void aumentarFuerza(int fuerza){
        this.fuerza += fuerza;
    }
    public void aumentarInteligencia(int inteligencia){
        this.inteligencia += inteligencia;
    }
    public void aumentarNivel(){
        this.nivel++;
    }

    public void enfrentamiento(Personaje otro, int momento){
        double poder1 = this.calcularPoderAtaque(momento);
        double poder2 = otro.calcularPoderAtaque(momento);
        if(poder1 > poder2) {
            this.subirNivel();
        }
        else if(poder2 > poder1) {
            otro.subirNivel();
        }
        else{
            this.subirNivel();
            otro.subirNivel();
        }
    }

    public List<Personaje> buscarOponentes(List<Personaje> oponentes){
        //List<Personaje> devolver = new LinkedList<Personaje>();
        return oponentes.stream()
                .filter(op -> ((op.getNivel() == this.getNivel() && op.calcularPoderAtaque(12) < 5) || (Math.abs(this.getNivel() - op.getNivel()) <= 2)))
                .collect(Collectors.toList());
    }
}
