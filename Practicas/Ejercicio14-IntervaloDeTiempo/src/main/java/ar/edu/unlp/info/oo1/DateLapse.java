package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class DateLapse {
    LocalDate from;
    LocalDate to;
    public DateLapse(){
        this.from = LocalDate.of(1972, 12, 15);
        this.to = LocalDate.of(2032, 12, 15);
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
        return from.isBefore(to) && to.isAfter(from);
    }
    public int sizeInDays(){
         // Retorna la cantidad de días que hay entre las dos fechas
        if (compararFechas(from, to)){
            return (int) from.until(to).getDays();
        }
        return 0;
    }
    public boolean includesDate(LocalDate other){
        // Retorna true si la fecha pasada como parámetro está dentro del rango
        return compararFechas(from, other) && compararFechas(other, to);
    }
}
