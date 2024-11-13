package org.example;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class ServicioTest {
    private Mascota mascota;
    private Veterinario veterinario;
    private ConsultaMedica consultaMedica;
    private Vacunacion vacunacion;
    private Guarderia guarderia;
    LocalDate fechaDomingo = LocalDate.of(2024, 11, 10);

    @BeforeEach
    void setUp(){
        mascota = new Mascota("Firulais", LocalDate.of(2019, 1, 1), "Perro");
        veterinario = new Veterinario("Juan", LocalDate.of(2020, 1, 12), 1000);
        consultaMedica = new ConsultaMedica(LocalDate.now(), veterinario, mascota);
        vacunacion = new Vacunacion(mascota, "Antirrabica", 500, veterinario, LocalDate.now());
        guarderia = new Guarderia(mascota, 5);
    }

    @Test
    void testConsultaMedica(){
        assertEquals(consultaMedica.calcularCosto(), 1700);
    }
    @Test
    void testConsultaMedicaDomingo(){
        consultaMedica = new ConsultaMedica(fechaDomingo, veterinario, mascota);
        assertEquals(consultaMedica.calcularCosto(), 1900);
    }

    @Test
    void testVacunacion(){
        assertEquals(vacunacion.calcularCosto(), 2000); //si no es domingo
    }
    @Test
    void testVacunacionDomingo(){
        vacunacion = new Vacunacion(mascota, "Antirrabica", 500, veterinario, fechaDomingo);
        assertEquals(vacunacion.calcularCosto(), 2200); //si no es domingo
    }

    @Test
    void testGuarderia(){
        assertEquals(guarderia.calcularCosto(), 2500);
    }

    @Test
    void testGuarderiaDescuento(){
        Vacunacion vacunacion1 = new Vacunacion(mascota, "Antirrabica", 500, veterinario, LocalDate.now());
        Vacunacion vacunacion2 = new Vacunacion(mascota, "Antirrabica", 500, veterinario, LocalDate.now());
        Vacunacion vacunacion3 = new Vacunacion(mascota, "Antirrabica", 500, veterinario, LocalDate.now());
        assertEquals(guarderia.calcularCosto(), 2250);
    }

    @Test
    void testCalcularMontosServicios(){
        assertEquals(mascota.calcularMontoServicios(LocalDate.now()), 6200);
    }
}
