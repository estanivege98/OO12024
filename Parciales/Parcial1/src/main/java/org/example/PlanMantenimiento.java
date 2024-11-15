package org.example;

import java.util.LinkedList;
import java.util.List;

public class PlanMantenimiento {
    private String version;
    private String paraModelo;
    private List<Tarea> tareas;

    public PlanMantenimiento(String version, String paraModelo) {
        this.version = version;
        this.paraModelo = paraModelo;
        this.tareas = new LinkedList<Tarea>();
    }
    public void agregarTarea(Tarea t) {
        this.tareas.add(t);
    }

    public String getParaModelo(){
        return this.paraModelo;
    }

    public List<Tarea> getTareas(){
        return this.tareas;
    }

    public double obtenerCosto(int mes){
        return this.tareas.stream()
                .filter(t -> t.getFecha().getMonthValue() == mes)
                .mapToDouble(tarea -> tarea.calcularCostoBase() + tarea.calcularCostoRepuestos()).sum();
    }

}
