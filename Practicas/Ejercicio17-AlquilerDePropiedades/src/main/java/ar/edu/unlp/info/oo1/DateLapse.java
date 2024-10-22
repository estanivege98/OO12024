package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
    LocalDate from;
    LocalDate to;
    public DateLapse(LocalDate from, LocalDate to){
        this.from = from;
        this.to = to;
    }
    public LocalDate getFrom(){
        // Retorna la fecha de inicio del rango
        return from;
    }
    public LocalDate getTo(){
        // Retorna la fecha de fin del rango
        return to;
    }
    private boolean compararFechas(LocalDate from, LocalDate to){
        // Compara dos fechas y retorna true si son iguales
        return from.isBefore(to) || from.isEqual(to);
    }
    public int sizeInDays(){
         // Retorna la cantidad de días que hay entre las dos fechas
        if (compararFechas(from, to)){
            return (int) ChronoUnit.DAYS.between(from, to);
        }
        return 0;
    }
    public boolean includesDate(LocalDate other){
        // Retorna true si la fecha pasada como parámetro está dentro del rango
        return compararFechas(from, other) && compararFechas(other, to);
    }
    /* Retorna true si el periodo de tiempo del receptor se superpone con el recibido como parametro */
    public boolean overlaps(DateLapse other){
        return this.includesDate(other.getFrom()) || this.includesDate(other.getTo());
    }
}
