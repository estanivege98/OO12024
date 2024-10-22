package ar.edu.unlp.info.oo1;
import java.time.LocalDate;
import java.util.*;
public class Usuario {
    private String nombre;
    private String direccion;
    private String DNI;
    private List<Reserva> reservas;
    private List<Propiedad> propiedadesEnAlquiler;

    public Usuario(String nombre, String direccion, String DNI){
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.reservas = new ArrayList<Reserva>();
        this.propiedadesEnAlquiler = new ArrayList<Propiedad>();
    }

    public boolean crearReserva(DateLapse periodo, Propiedad propiedad){
        if(propiedad.consultarDisponibilidad(periodo)){
            Reserva reserva = new Reserva(this, propiedad, periodo);
            this.reservas.add(reserva);
            propiedad.getFechasReservadas().add(periodo);
            return true;
        }
        return false;
    }
    public boolean cancelarReserva(Reserva reserva){
        if(this.reservas.contains(reserva) && !reserva.getPeriodo().includesDate(LocalDate.now())){
            this.reservas.remove(reserva);
            reserva.getPropiedad().getFechasReservadas().remove(reserva.getPeriodo());
            return true;
        }
        return false;
    }
    public List<Propiedad> getPropiedades(){
        return this.propiedadesEnAlquiler;
    }
    public void agregarPropiedad(Propiedad propiedad){
        this.propiedadesEnAlquiler.add(propiedad);
    }
    public void quitarPropiedad(Propiedad propiedad){
        this.propiedadesEnAlquiler.remove(propiedad);
    }

    public double calcularIngresos(DateLapse periodo){
        return this.propiedadesEnAlquiler.stream()
                .mapToDouble(propiedad -> propiedad.consultarIngresosPeriodo(periodo))
                .sum() * 0.75;
    }
}
