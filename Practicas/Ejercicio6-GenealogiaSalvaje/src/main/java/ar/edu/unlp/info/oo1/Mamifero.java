package ar.edu.unlp.info.oo1;
import java.time.LocalDate;
public class Mamifero {
    private String identificador;
    private Mamifero madre;
    private Mamifero padre;
    private LocalDate fechaNacimiento;
    private String especie;

    public Mamifero(String nombre) {
        this.identificador = nombre;
    }
    public Mamifero(){

    }

    // getters
    public Mamifero getMadre() {
        return madre;
    }
    public Mamifero getPadre() {
        return padre;
    }
    public String getIdentificador(){
        return identificador;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public String getEspecie(){
        return especie;
    }
    public Mamifero getAbueloMaterno(){
        if (madre != null){
            return madre.getPadre();
        }
        return null;
    }
    public Mamifero getAbuelaMaterna(){
        if (madre != null){
            return madre.getMadre();
        }
        return null;
    }
    public Mamifero getAbueloPaterno(){
        if (padre != null){
            return padre.getPadre();
        }
        return null;
    }
    public Mamifero getAbuelaPaterna(){
        if (padre != null){
            return padre.getMadre();
        }
        return null;
    }

    // setters
    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }
    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setIdentificador(String nombre){
        this.identificador = nombre;
    }


    public boolean tieneComoAncestroA(Mamifero unAncestro){
        if (this.getMadre() == unAncestro || this.getPadre() == unAncestro){
            return true;
        }
        if (this.getMadre() != null && this.getMadre().tieneComoAncestroA(unAncestro)){
            return true;
        }
        if (this.getPadre() != null && this.getPadre().tieneComoAncestroA(unAncestro)){
            return true;
        }
        return false;
    }
}
