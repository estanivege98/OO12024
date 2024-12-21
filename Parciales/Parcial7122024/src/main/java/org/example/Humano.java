package org.example;

public class Humano extends Personaje{

    public Humano(String nombre, IRol rol){
        super(nombre, 2, 1, rol);
    }

    public double calcularPoderAtaque(int momento){
        return (esDeDia(momento) ? (this.getRol().valorBase(this) * 1.40) : this.getRol().valorBase(this));
    }

    public void subirNivel(){
        this.aumentarNivel();
        if(this.getNivel() >= 7){
            this.getRol().aumentarHabilidades(this);
        }
    }
}
