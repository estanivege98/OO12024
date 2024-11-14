package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
public class TrenTest {
    private Tren tren1;
    private Tren tren2;
    private PlanMantenimiento planMantenimiento1;
    private PlanMantenimiento planMantenimiento2;
    private Tarea tarea1;
    private Tarea tarea2;
    private Tarea tarea3;
    private Viaje viaje1;
    private Viaje viaje2;

    @BeforeEach
    void setUp(){
        tren1 = new Tren("Modelo1", "Marca1", "ABC123", LocalDate.of(2021, 3, 12), 50);
        tren2 = new Tren("Modelo2", "Marca2", "DEF456", LocalDate.of(2021, 3, 12), 100);
    }

    @Test
    void testAgregarPlanMantenimiento(){
        planMantenimiento1 = new PlanMantenimiento("1", "Modelo1");
        planMantenimiento2 = new PlanMantenimiento("2", "Modelo2");
        assertTrue(tren1.agregarPlanMantenimiento(planMantenimiento1));
        assertFalse(tren1.agregarPlanMantenimiento(planMantenimiento2));
    }

    @Test
    void testRegistrarViaje(){
        viaje1 = new Viaje(LocalDate.of(2024, 11, 23), 100);
        viaje2 = new Viaje(LocalDate.of(2024, 11, 24), 200);
        tren1.registrarViaje(viaje1);
        tren1.registrarViaje(viaje2);
        assertEquals(2, tren1.obtenerViajes().size());
    }

    @Test
    void testObtenerMontoTareas(){
        tarea1 = new TareaTiempo(100, 2, 1, 10, LocalDate.now());
        tarea2 = new TareaRodadura(100, 50, 2, 10, LocalDate.now());
        tarea3 = new TareaTiempo(200, 3, 3, 5, LocalDate.now());
        planMantenimiento1 = new PlanMantenimiento("1", "Modelo1");
        planMantenimiento1.agregarTarea(tarea1);
        planMantenimiento1.agregarTarea(tarea2);
        planMantenimiento1.agregarTarea(tarea3);

        tren1.agregarPlanMantenimiento(planMantenimiento1);

        assertEquals(502.5, tren1.obtenerMontoTareas(11));
    }
}
