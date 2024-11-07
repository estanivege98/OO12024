package ar.edu.unlp.info.oo1;
import java.time.LocalDate;
public class PoliticaCancelacionFlexible extends PoliticaCancelacion{
    public double reembolso(Reserva reserva){
        if(LocalDate.now().isAfter(reserva.getPeriodo().getFrom())){
            return 0;
        }
        else{
            return reserva.calcularPrecioReserva();
        }
    }
}
