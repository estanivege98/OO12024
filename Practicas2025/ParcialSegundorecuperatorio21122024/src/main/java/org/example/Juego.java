package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Juego extends Actividad {
    private List<Item> items;

    public Juego(LocalDate fechaInicio, String dirIp, int duracionTotal) {
        super(fechaInicio, dirIp, duracionTotal);
        this.items = new LinkedList<Item>();
    }

    public void utilizarItem(Item item) {
        this.items.add(item);
    }

    private double calcularItems(){
        return items.stream()
                .mapToDouble(item -> item.precioFinal())
                .sum();
    }

    public double calcularActividad() {
        return (getDuracionTotal() > 360 ? calcularItems() : 0);
    }
}