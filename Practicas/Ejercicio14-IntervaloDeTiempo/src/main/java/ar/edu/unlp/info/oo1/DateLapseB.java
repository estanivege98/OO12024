package ar.edu.unlp.info.oo1;
import java.time.LocalDate;

public class DateLapseB {
    private LocalDate from;
    private int sizeInDays;

    public DateLapseB(){
        this.from = LocalDate.of(1972, 12, 15);
        this.sizeInDays = 21915;
    }

    public LocalDate getFrom(){
        // Retorna la fecha de inicio del rango
        return this.from;
    }

    public LocalDate getTo(){
        // Retorna la fecha de fin del rango
        return this.getFrom().plusDays(sizeInDays);
    }

    public int sizeInDays(){
        // Retorna la cantidad de días que hay entre las dos fechas
        return this.sizeInDays;
    }

    public boolean includesDate(LocalDate other){
        // Retorna true si la fecha pasada como parámetro está dentro del rango
        return this.getFrom().isBefore(other) && this.getTo().isAfter(other);
    }
}
