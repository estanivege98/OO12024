package org.example;

public class Orco extends Personaje{

    public Orco(String nombre, IRol rol){
        super(nombre, 1, 2, rol);
    }

    public double calcularPoderAtaque(int momento){
        return (esDeDia(momento) ? (this.getRol().valorBase(this)) : this.getRol().valorBase(this) * 1.60);
    }

    public void subirNivel(){
        this.aumentarNivel();
        if(this.getNivel() % 3 == 0){
            this.getRol().aumentarHabilidades(this);
        }
    }
}
