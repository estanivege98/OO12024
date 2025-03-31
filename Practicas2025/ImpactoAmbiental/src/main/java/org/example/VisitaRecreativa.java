package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class VisitaRecreativa extends Visita {
    private List<Participante> participantes;

    public VisitaRecreativa(String fecha, int duracion) {
        super(fecha, duracion);
        this.participantes = new LinkedList<>();
    }

    public void agregarParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    public double calcularImpactoAmbiental() {
        return this.participantes.size() * this.duracion;
    }

    public List<Participante> listarParticipantes() {
        return this.participantes.stream()
                .sorted((p1, p2) -> p1.getApellido().compareToIgnoreCase(p2.getApellido()))
                .collect(Collectors.toList());
    }

    public void mostrarParticipantes(){
        List<Participante>listado = listarParticipantes();
        for(Participante p : listado){
            System.out.println(p.toString());
        }
    }

}
