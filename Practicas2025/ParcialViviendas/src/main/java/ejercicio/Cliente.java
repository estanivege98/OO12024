package ejercicio;

import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String direccion;
    private List<Contratacion> contrataciones;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contrataciones = new LinkedList<Contratacion>();
    }

    public void agregarContratacion(Contratacion contratacion) {
        this.contrataciones.add(contratacion);
    }

    public void contrartarPorUnicaVez(LocalDate fe, Servicio servicio) {
        UnicaVez unicaVez = new UnicaVez(fe, servicio);
        agregarContratacion(unicaVez);
    }

    public void contrartarProlongado(LocalDate fe,int cantDias, Servicio servicio) {
        Prolongado prolongado = new Prolongado(fe, cantDias, servicio);
        agregarContratacion(prolongado);
    }

    public double obtenerMontoAPagar(){
        return this.contrataciones.stream()
                .mapToDouble(c -> c.montoAbonar())
                .sum();
    }


}
