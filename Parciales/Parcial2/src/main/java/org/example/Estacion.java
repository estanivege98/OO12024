package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Estacion {
    private String direccion;
    private Integer cantidadLugaresDisponible;
    private List<Bicicleta> bicicletas;

    public Estacion(String dir, Integer cantL) {
        this.direccion = dir;
        this.cantidadLugaresDisponible = cantL;
        this.bicicletas = new ArrayList<>();
    }

    public void agregarBicicleta(Bicicleta bicicleta) {
        if (cantidadLugaresDisponible > 0) {
            bicicletas.add(bicicleta);
            cantidadLugaresDisponible--;
        }
    }

    /*public List<Estacion> cantidadBicicletasDisponibles() {
        return bicicletas.size();
    }*/

    // Getters and setters

    public Integer getCantidadLugaresDisponible() {
        return cantidadLugaresDisponible;
    }




}