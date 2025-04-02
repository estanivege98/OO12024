package ejercicio;

public abstract class Servicio {
    private double precioHora;
    private int cantidadHoras;

    public Servicio(double precioHora, int cantidadHoras) {
        this.precioHora = precioHora;
        this.cantidadHoras = cantidadHoras;
    }



    public double getPrecio(){
        return this.precioHora * this.cantidadHoras;
    }

    public abstract double montoAbonar();
}
