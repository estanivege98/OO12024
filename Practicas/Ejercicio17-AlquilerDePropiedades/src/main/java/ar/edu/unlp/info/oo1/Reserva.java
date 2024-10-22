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

    public double calcularPrecioReserva(){
        return periodo.sizeInDays() * propiedad.getPrecio();
    }
    public double calcularIngreso(){
        
    }
}
