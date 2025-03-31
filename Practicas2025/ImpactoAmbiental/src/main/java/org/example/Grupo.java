package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Grupo {
    private String colegio;
    private int id;
    private List<Participante> alumnos;
    private List<Participante> docentes;

    public Grupo(String colegio, int id) {
        this.colegio = colegio;
        this.id = id;
        this.alumnos = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    public void agregarAlumno(Participante alumno) {
        this.alumnos.add(alumno);
    }

    public void agregarDocente(Participante docente) {
        this.docentes.add(docente);
    }

    public double impactoAlumnos() {
        return this.alumnos.size() * 0.5;
    }

    public double cantidadDocentes() {
        return this.docentes.size();
    }

    protected List<Participante> ordenarAlumnos(){
        return this.alumnos.stream()
                .sorted((a1, a2) -> a1.getApellido().compareTo(a2.getApellido()))
                .collect(Collectors.toList());
    }

    protected List<Participante> ordenarDocentes(){
        return this.docentes.stream()
                .sorted((d1, d2) -> d1.getApellido().compareTo(d2.getApellido()))
                .collect(Collectors.toList());
    }
}
