package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Cliente {
    private String direccion;
    private String nombre;
    private List<Envio> envios;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.envios = new ArrayList<Envio>();
    }
    public List<Envio> getEnvios() {
        return this.envios;
    }
    private Stream<Envio> getEnviosPeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
        return this.envios.stream().filter(envio -> envio.getFechaDespacho().isAfter(fechaInicio) && envio.getFechaDespacho().isBefore(fechaFin));
    }
    public double calcularMontoPeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
        return this.getEnviosPeriodo(fechaInicio, fechaFin).mapToDouble(Envio::costo).sum();
    }
    abstract double calcularMonto(LocalDate fechaInicio, LocalDate fechaFin);
}
