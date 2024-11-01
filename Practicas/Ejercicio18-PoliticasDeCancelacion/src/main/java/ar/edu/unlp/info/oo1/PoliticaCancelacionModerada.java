package ar.edu.unlp.info.oo1;
import java.time.LocalDate;
public class PoliticaCancelacionModerada extends PoliticaCancelacion{
    public double reembolso(Reserva reserva){
        LocalDate now = LocalDate.now();
        LocalDate startDate = reserva.getPeriodo().getFrom();
        long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(now, startDate);
        if(daysBetween >= 7){
            return reserva.calcularPrecioReserva();
        }
        else if(daysBetween >= 2){
            return reserva.calcularPrecioReserva() * 0.5;
        }
        else{
            return 0;
        }
    }
}
