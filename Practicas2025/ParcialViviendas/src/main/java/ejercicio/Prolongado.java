package ejercicio;

import java.time.LocalDate;

public class Prolongado extends Contratacion{
    private int cantDias;

    public Prolongado(LocalDate fechaInicio, int cantDias, Servicio servicio) {
        super(fechaInicio, servicio);
        this.cantDias = cantDias;
    }

    private boolean mas5Dias(){
        return this.cantDias >= 5;
    }

    public double montoAbonar() {
        double descuento = (mas5Dias() ? 0.10: 0);
        return (this.getServicio().montoAbonar() * this.cantDias) - (descuento * this.getServicio().montoAbonar());
    }
}
