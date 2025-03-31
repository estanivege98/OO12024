package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class VisitaCientifica extends Visita {
    private List<Participante> participantes;
    private List<Zona> zonas;

    public VisitaCientifica(String fecha, int duracion) {
        super(fecha, duracion);
        this.participantes = new ArrayList<Participante>();
        this.zonas = new ArrayList<Zona>();
    }

    public void agregarParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    public void agregarZona(Zona zona) {
        this.zonas.add(zona);
    }

    public double calcularImpactoAmbiental() {
            double calculoZonas = this.zonas.stream()
                    .mapToDouble(z -> z.esRestringida())
                    .sum();
            return 50 + (this.duracion * 5) + calculoZonas;
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
