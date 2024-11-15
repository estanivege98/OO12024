package org.example;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class PlanMantenimientoTest {
    private PlanMantenimiento planMantenimiento;
    private Tarea tarea1;
    private Tarea tarea2;
    private Tarea tarea3;
    private Repuesto repuesto;

    @BeforeEach
    void setUp(){
        planMantenimiento = new PlanMantenimiento("1", "Modelo1");
        tarea1 = new TareaTiempo(100, 2, 1, 10, LocalDate.now());
        tarea2 = new TareaRodadura(100, 50, 2, 10, LocalDate.now());
        tarea3 = new TareaTiempo(200, 3, 3, 5, LocalDate.now());
    }

    @Test
    void testAgregarTarea(){
        planMantenimiento.agregarTarea(tarea1);
        planMantenimiento.agregarTarea(tarea2);
        planMantenimiento.agregarTarea(tarea3);
        assertEquals(3, planMantenimiento.getTareas().size());
    }

    @Test
    void testObtenerCosto(){
        planMantenimiento.agregarTarea(tarea1);
        planMantenimiento.agregarTarea(tarea2);
        tarea2.agregarRepuesto(new Repuesto("Rueda", 100));
        planMantenimiento.agregarTarea(tarea3);
        assertEquals(402.5, planMantenimiento.obtenerCosto(11));
        assertEquals(0, planMantenimiento.obtenerCosto(12));
    }


}
