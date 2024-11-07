package ar.edu.unlp.info.oo1;

import java.util.*;

public class Propiedad {
    private List<DateLapse> fechasReservadas;
    private String direccion;
    private String nomDesc;
    private double precioNoche;
    private PoliticaCancelacion politica;

    public Propiedad(String direccion, String nomDesc, double precioNoche){
        this.direccion = direccion;
        this.nomDesc = nomDesc;
        this.precioNoche = precioNoche;
        this.fechasReservadas = new ArrayList<DateLapse>();
    }

    public void agregarPeriodoReserva(DateLapse periodo){
        this.fechasReservadas.add(periodo);
    }
    public void quitarPeriodoReserva(DateLapse periodo){
        this.fechasReservadas.remove(periodo);
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

    public double consultarPrecioPeriodo(DateLapse periodo){
        return this.precioNoche * periodo.sizeInDays();
    }

    public double consultarIngresosPeriodo(DateLapse periodo){
        return this.getFechasReservadas().stream()
                .filter(fecha -> fecha.overlaps(periodo))
                .mapToDouble(fecha -> this.consultarPrecioPeriodo(fecha))
                .sum();
    }

    public void asignarPoliticaCancelacion(PoliticaCancelacion politica){
        this.politica = politica;
    }
    public double reembolso(Reserva reserva){
        return this.politica.reembolso(reserva);
    }
}
