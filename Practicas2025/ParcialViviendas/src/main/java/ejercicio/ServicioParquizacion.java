package ejercicio;

public class ServicioParquizacion extends Servicio {
    private int cantMaquinas;
    private double costoMantenimiento;

    public ServicioParquizacion(double precioHora, int cantidadHoras, int cantMaquinas, double costoMantenimiento) {
        super(precioHora, cantidadHoras);
        this.cantMaquinas = cantMaquinas;
        this.costoMantenimiento = costoMantenimiento;
    }

    private double getCostoMantenimiento() {
        return this.costoMantenimiento * this.cantMaquinas;
    }

    public double montoAbonar(){
        return this.getPrecio() + this.getCostoMantenimiento();
    }
}
