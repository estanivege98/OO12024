package org.example;

import java.util.LinkedList;
import java.util.List;

public class ColeccionCobros {
    private List<Cobro> cobros;

    public ColeccionCobros() {
        this.cobros = new LinkedList<>();
    }

    public ColeccionCobros(List<Cobro> cobros) {
        this.cobros = cobros;
    }

    public void agregarCobro(Cobro cobro) {
        this.cobros.add(cobro);
    }

    public double valorLiquido(){
        return this.cobros.stream()
                .filter(c -> !c.estaVencido())
                .mapToDouble(c -> c.getMonto())
                .sum();
    }
}
