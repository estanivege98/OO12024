package ejercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnicaVez extends Contratacion {

    public UnicaVez(LocalDate fechaInicio, Servicio servicio) {
        super(fechaInicio, servicio);
    }

    private boolean finDeSemana(){
        DayOfWeek dia = DayOfWeek.from(this.getFecha().getDayOfWeek());
        return dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY);
    }

    public double montoAbonar() {
        double recargo = (finDeSemana() ? 0.15 : 0);
        return this.getServicio().montoAbonar() + (recargo * this.getServicio().montoAbonar());
    }
}
