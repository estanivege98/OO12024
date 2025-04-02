package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VisitaRecreativaTest {
    private VisitaRecreativa vis1Hora;
    private VisitaRecreativa vis2Horas;
    private Participante par1;
    private Participante par2;
    private Participante par3;

    @BeforeEach
    public void setUp() {
        vis1Hora = new VisitaRecreativa("2025-10-01", 1);
        vis2Horas = new VisitaRecreativa("2025-10-02", 2);
        par1 = new Participante("Juan", "Pérez");
        par2 = new Participante("Ana", "Gómez");
        par3 = new Participante("Luis", "Martínez");
        vis1Hora.agregarParticipante(par1);
        vis1Hora.agregarParticipante(par2);
        vis1Hora.agregarParticipante(par3);
        vis2Horas.agregarParticipante(par1);
        vis2Horas.agregarParticipante(par2);
        vis2Horas.agregarParticipante(par3);
    }

    @Test
    public void testVisita1Hora(){
        assertEquals(3.0, vis1Hora.calcularImpactoAmbiental());
        assertEquals(3, vis1Hora.listarParticipantes().size());
        System.out.println("Participantes de la visita de 1 hora:");
        vis1Hora.mostrarParticipantes();
    }

    @Test
    public void testVisita2Horas(){
        assertEquals(6, vis2Horas.calcularImpactoAmbiental());
        assertEquals(3, vis2Horas.listarParticipantes().size());
        System.out.println("Participantes de la visita de 2 horas:");
        vis2Horas.mostrarParticipantes();
    }
}
