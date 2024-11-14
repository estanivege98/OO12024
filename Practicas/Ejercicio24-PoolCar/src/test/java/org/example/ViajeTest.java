package org.example;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class ViajeTest {
    private Conductor conductor;
    private Pasajero pasajero;
    private Vehiculo vehiculo;
    private Viaje viaje;

    @BeforeEach
    void setUp(){
        vehiculo = new Vehiculo("Un auto", 5, 2022, 100000);
        conductor = new Conductor("Juan", vehiculo);
        pasajero = new Pasajero("Pedro");
    }

    @Test
    void testRegistrarViaje(){
        viaje = conductor.registrarViaje("A", "B", 100, vehiculo, LocalDate.now());
        assertEquals(1, conductor.getViajes().size());
    }

    @Test
    void testProcesarViaje(){
        conductor.cargarSaldo(600);
        viaje = conductor.registrarViaje("A", "B", 1000, vehiculo, LocalDate.of(2024, 11, 28));
        pasajero.cargarSaldo(600);
        viaje.registrarPasajero(pasajero);
        viaje.procesarViaje();
        assertEquals(40, pasajero.getSaldo());
        assertEquals(1094, conductor.getSaldo());
        assertEquals(2, viaje.getPasajeros().size());
    }
}
