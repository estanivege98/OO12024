package ar.edu.unlp.info.oo1;

public class Reserva {
    private Usuario usuario;
    private Propiedad propiedad;
    private DateLapse periodo;

    public Reserva(Usuario usuario, Propiedad propiedad, DateLapse periodo){
        this.usuario = usuario;
        this.propiedad = propiedad;
        this.periodo = periodo;
    }
    public Propiedad getPropiedad(){
        return this.propiedad;
    }
    public DateLapse getPeriodo(){
        return this.periodo;
    }
    public double calcularPrecioReserva(){
        return periodo.sizeInDays() * propiedad.getPrecio();
    }
}
