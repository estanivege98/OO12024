package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presencial extends Evento{

    private List<Sede> sedes;

    public Presencial(String nombre, LocalDate fecha, String tema, double precioInscripcion, double precioRemera) {
        super(nombre, fecha, tema, precioInscripcion, precioRemera);
        this.sedes = new ArrayList<Sede>();
    }

    public double consultarPrecioAsistencia(LocalDate fecha) {
        double precio = this.getPrecioInscripcion() + this.getPrecioRemera() + this.sedes.stream().mapToDouble(sede -> sede.calcularCostoEstadia()).sum();
        return (this.esMismoDia(fecha) ? precio * 1.20 : precio);
    }


    public void agregarSede(Sede sede) {
        this.sedes.add(sede);
    }
}
