package ar.edu.unlp.info.oo1;

import java.util.*;

public class Propiedad {
    private List<DateLapse> fechasReservadas;
    private String direccion;
    private String nomDesc;
    private double precioNoche;

    public Propiedad(String direccion, String nomDesc, double precioNoche){
        this.direccion = direccion;
        this.nomDesc = nomDesc;
        this.precioNoche = precioNoche;
        this.fechasReservadas = new ArrayList<DateLapse>();
    }

    public List<DateLapse> getFechasReservadas(){
        return this.fechasReservadas;
    }
    public double getPrecio(){
        return this.precioNoche;
    }
    public boolean consultarDisponibilidad(DateLapse periodo){
        return fechasReservadas.stream()
                .noneMatch(fecha -> fecha.overlaps(periodo));
    }

}
