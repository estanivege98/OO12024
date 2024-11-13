package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;

public class Mascota {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String especie;
    private List<IServicio> servicios;

    public Mascota(String nombre, LocalDate fechaNacimiento, String especie) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.servicios = new LinkedList<IServicio>();
    }

    public List<IServicio> getServicios(){
        return this.servicios;
    }

    public void agregarServicio(IServicio servicio){
        this.servicios.add(servicio);
    }

    public double calcularMontoServicios(LocalDate fecha){
        return this.servicios.stream()
                .filter(s -> s.getFecha().isEqual(fecha))
                .mapToDouble(IServicio::calcularCosto).sum();

    }
}
