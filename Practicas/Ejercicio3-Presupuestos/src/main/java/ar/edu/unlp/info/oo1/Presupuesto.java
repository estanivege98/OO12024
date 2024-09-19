package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
    private String cliente;
    private LocalDate fecha;
    private List<Item> items;

    public Presupuesto(String cliente) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.items = new ArrayList<Item>();
    }

    // getters
    public String getCliente() {
        return cliente;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public List<Item> getItems() {
        return items;
    }

    // setters
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    // Agrego items
    public void agregarItem(Item item){
        this.items.add(item);
    }

    // Calculo el total
    public double calcularTotal(){
        double total = 0;
        for (Item item : this.getItems()) {
            total += item.costo();
        }
        return total;
    }
}
