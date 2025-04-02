package ejercicio;

public class ServicioLimpieza extends Servicio {
    private double tarifaMinima;

    public ServicioLimpieza(double precioHora, int cantidadHoras,double tarifaMinima) {
        super(precioHora, cantidadHoras);
        this.tarifaMinima = tarifaMinima;
    }

    public double montoAbonar() {
        return (this.getPrecio() > this.tarifaMinima ? this.getPrecio() : this.tarifaMinima);    }
}
