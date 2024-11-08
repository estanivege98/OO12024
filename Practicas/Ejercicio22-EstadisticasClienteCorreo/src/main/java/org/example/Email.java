package org.example;
import java.util.*;
public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> adjuntos;

    public Email(){
        this.adjuntos = new ArrayList<Archivo>();
    }

    public Email(String titulo, String cuerpo){
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.adjuntos = new ArrayList<Archivo>();
    }

    // getters
    public String getTitulo(){
        return this.titulo;
    }
    public String getCuerpo(){
        return this.cuerpo;
    }
    public List<Archivo> adjuntos(){
        return this.adjuntos;
    }

    // Metodo para agregar adjuntos
    public void agregarAdjunto(Archivo adjunto){
        this.adjuntos.add(adjunto);
    }

    // Metodos para saber si un texto esta contenido en el titulo y cuerpo del mail
    public boolean contieneTexto(String texto){
        return this.titulo.contains(texto) || this.cuerpo.contains(texto);
    }
    public int tamañoMail(){
        return this.cuerpo.length() + this.titulo.length() +this.adjuntos().stream().mapToInt(Archivo::tamañoFile).sum();
    }
}
