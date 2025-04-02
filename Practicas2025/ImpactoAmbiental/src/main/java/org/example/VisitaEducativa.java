package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VisitaEducativa extends Visita {
    private List<Grupo> grupos;

    public VisitaEducativa(String fecha, int duracion) {
        super(fecha, duracion);
        this.grupos = new ArrayList<>();
    }

    public void agregarGrupo(Grupo grupo) {
        this.grupos.add(grupo);
    }

    public double calcularImpactoAmbiental() {
         return this.grupos.stream()
                .mapToDouble(g -> (g.impactoAlumnos() * this.duracion) - (g.cantidadDocentes() * this.duracion) + 2 * this.duracion)
                .sum();
    }

    public List<Participante> listarParticipantes(){
        List<Participante> alumnos = new ArrayList<>();
        for (Grupo grupo : this.grupos){
            alumnos.addAll(grupo.ordenarAlumnos());
            alumnos.addAll(grupo.ordenarDocentes());
        }
        return alumnos.stream()
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
