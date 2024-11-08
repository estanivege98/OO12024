package org.example;


import java.util.*;
public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;

    public ClienteDeCorreo(Carpeta inbox){
        this.carpetas = new ArrayList<Carpeta>();
        this.inbox = inbox;
        this.carpetas.add(this.inbox);
    }

    public void crearCarpeta(String nom){
        this.carpetas.add(new Carpeta(nom));
    }
    public void recibir(Email mail){
        this.inbox.store(mail);
    }
    public void mover(Email email, Carpeta origen, Carpeta destino){
        origen.mover(email, destino);
    }
    public Email buscar(String texto){
        return this.carpetas.stream()
                .map(carpeta -> carpeta.searchMails(texto))
                .filter(email -> email != null)
                .findFirst()
                .orElse(null);
    }
    public int espacioOcupado(){
        return this.carpetas.stream().mapToInt(Carpeta::tamañoCarpeta).sum();
    }

    //cantidad total de emails en el cliente de correo: considerando todas las carpetas existentes.
    public int cantidadTotalEmails(){
        return this.carpetas.stream().mapToInt(Carpeta::cantidadEmails).sum() + this.inbox.cantidadEmails();
    }
}
