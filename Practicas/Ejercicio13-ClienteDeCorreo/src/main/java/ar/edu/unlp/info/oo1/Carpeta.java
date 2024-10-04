package ar.edu.unlp.info.oo1;
import java.util.*;
import java.util.stream.Collectors;

public class Carpeta {
    private List<Email> emails;
    private String nombre;

    public Carpeta(String nombre){
        this.nombre = nombre;
        this.emails = new ArrayList<Email>();
    }

    public String getNombre(){
        return this.nombre;
    }
    public List<Email> getEmails(){
        return this.emails;
    }

    /* Metodos para eliminar, agregar y move emails*/
    public void store(Email mail){
        this.emails.add(mail);
    }
    public void delete(Email mail){
        this.emails.remove(mail);
    }
    public void mover(Email mail, Carpeta carpeta){
        this.emails.remove(mail);
        carpeta.store(mail);
    }

    // Busca un mail en la carpeta
    public Email searchMails(String texto){
        return this.emails.stream()
                .filter(email -> email.contieneTexto(texto))
                .findFirst()
                .orElse(null);
    }

    // Tamaño ocupado en la carpeta
    public int tamañoCarpeta(){
        return this.emails.stream().mapToInt(Email::tamañoMail).sum();
    }
}
