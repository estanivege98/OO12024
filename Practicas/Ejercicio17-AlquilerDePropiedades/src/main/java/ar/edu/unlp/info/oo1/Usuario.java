package ar.edu.unlp.info.oo1;

public class Usuario {
    private String nombre;
    private String direccion;
    private String DNI;
    private List<Reserva> reservas;
    private List<Reserva> propiedadesEnAlquiler;

    public Usuario(String nombre, String direccion, String DNI){
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.reservas = new ArrayList<Reserva>();
        this.propiedadesEnAlquiler = new ArrayList<Reserva>();
    }

    public boolean crearReserva(DateLapse periodo, Propiedad propiedad){

    }
    public boolean cancelarReserva(DateLapse periodo, Propiedad propiedad){

    }
}
