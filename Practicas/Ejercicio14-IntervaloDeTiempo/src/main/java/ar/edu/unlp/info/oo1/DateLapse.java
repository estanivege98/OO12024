package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class DateLapse {
    LocalDate fecha1;
    LocalDate fecha2;
    public DateLapse(){
        this.fecha1 = LocalDate.of(1972, 12, 15);
        this.fecha2 = LocalDate.of(2032, 12, 15);
    }
    public LocalDate getFrom(){
        // Retorna la fecha de inicio del rango
        return fecha1;
    }
    public LocalDate getTo(){
        // Retorna la fecha de fin del rango
        return fecha2;
    }
    private boolean compararFechas(LocalDate fecha1, LocalDate fecha2){
        // Compara dos fechas y retorna true si son iguales
        return fecha1.isBefore(fecha2) && fecha2.isAfter(fecha1);
    }
    public int sizeInDays(){
         // Retorna la cantidad de días que hay entre las dos fechas
        if (compararFechas(fecha1, fecha2)){
            return (int) fecha1.until(fecha2).getDays();
        }
        return 0;
    }
    public boolean includesDate(LocalDate other){
        // Retorna true si la fecha pasada como parámetro está dentro del rango
        return compararFechas(fecha1, other) && compararFechas(other, fecha2);
    }
}
