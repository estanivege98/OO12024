package ar.edu.unlp.info.oo1;
import java.util.*;
public class Inversor {
    private String nombre;
    private List<IInversion> inversiones;

    public Inversor(String nombre){
        this.nombre = nombre;
        this.inversiones = new ArrayList<IInversion>();
    }

    // getters
    public String getNombre(){
        return this.nombre;
    }
    public List<IInversion> getInversiones(){
        return this.inversiones;
    }

    // setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void agregarInversion(IInversion inversion){
        this.inversiones.add(inversion);
    }
    public double valorActual(){
        return this.inversiones.stream().mapToDouble(IInversion::valorInversion).sum();
    }
}
