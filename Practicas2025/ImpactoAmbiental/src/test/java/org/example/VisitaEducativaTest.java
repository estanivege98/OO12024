package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VisitaEducativaTest {
    // Grupos
    private Grupo g1;
    private Grupo g2;

    // Docentes
    private Participante doc1;
    private Participante doc2;
    private Participante doc3;

    // Alumnos
    private Participante alu1;
    private Participante alu2;
    private Participante alu3;

    // Visitas
    private VisitaEducativa vis1Hora;
    private VisitaEducativa vis2Horas;

    @BeforeEach
    public void setUp(){
        // Inicializar grupos
        g1 = new Grupo("Colegio A", 1);
        g2 = new Grupo("Colegio B", 2);

        // Inicializar docentes
        doc1 = new Participante("Juan", "Pérez");
        doc2 = new Participante("Ana", "Gómez");
        doc3 = new Participante("Luis", "Martínez");

        // Inicializar alumnos
        alu1 = new Participante("Pedro", "García");
        alu2 = new Participante("María", "López");
        alu3 = new Participante("Carlos", "Fernández");

        // Agregar docentes a los grupos
        g1.agregarDocente(doc1);

        g2.agregarDocente(doc2);
        g2.agregarDocente(doc3);

        // Agregar alumnos a los grupos
        g1.agregarAlumno(alu1);
        g1.agregarAlumno(alu2);

        g2.agregarAlumno(alu3);

        // Inicializar visitas
        vis1Hora = new VisitaEducativa("2025-10-01", 1);
        vis2Horas = new VisitaEducativa("2025-10-02", 2);
    }

    @Test
    public void testCalcularImpacto1Hora1Grupo(){
        vis1Hora.agregarGrupo(g1);

        // Calcular impacto ambiental
        double impacto = vis1Hora.calcularImpactoAmbiental();

        // Verificar el resultado
        assertEquals(2.0, impacto);
    }

    @Test
    public void testCalcularImpacto1Hora2Grupos(){
        vis1Hora.agregarGrupo(g1);
        vis1Hora.agregarGrupo(g2);

        // Calcular impacto ambiental
        double impacto = vis1Hora.calcularImpactoAmbiental();

        // Verificar el resultado
        assertEquals(2.5, impacto);
    }

    @Test
    public void testCalcularImpacto2Horas1Grupo(){
        vis2Horas.agregarGrupo(g1);

        // Calcular impacto ambiental
        double impacto = vis2Horas.calcularImpactoAmbiental();

        // Verificar el resultado
        assertEquals(4.0, impacto);
    }

    @Test
    public void testCalcularImpacto2Horas2Grupos(){
        vis2Horas.agregarGrupo(g1);
        vis2Horas.agregarGrupo(g2);

        // Calcular impacto ambiental
        double impacto = vis2Horas.calcularImpactoAmbiental();

        // Verificar el resultado
        assertEquals(5.0, impacto);
    }
}
