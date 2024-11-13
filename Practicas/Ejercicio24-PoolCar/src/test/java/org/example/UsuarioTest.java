package org.example;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class UsuarioTest {
    private Conductor conductor;
    private Pasajero pasajero;
    private Vehiculo vehiculoNuevo;
    private Viaje viaje;
    private Vehiculo vehiculoViejo;
    private Conductor conductorViejo;

    @BeforeEach
    void setUp(){
        vehiculoNuevo = new Vehiculo("Un auto", 5, 2022, 100000);
        conductor = new Conductor("Juan", vehiculoNuevo);
        pasajero = new Pasajero("Pedro");
        viaje = conductor.registrarViaje("A", "B", 100, vehiculoNuevo, LocalDate.now());
    }

    @Test
    void testSaldoPasajero(){
        assertEquals(0, pasajero.getSaldo());
        pasajero.cargarSaldo(100);
        assertEquals(90, pasajero.getSaldo());
    }

    @Test
    void testSaldoConductor(){
        vehiculoViejo = new Vehiculo("Otro auto", 4, 2000, 30000);
        conductorViejo = new Conductor("Ernesto", vehiculoViejo);
        assertEquals(0, conductor.getSaldo());
        assertEquals(0, conductorViejo.getSaldo());
        conductor.cargarSaldo(100);
        conductorViejo.cargarSaldo(100);
        assertEquals(99, conductor.getSaldo());
        assertEquals(90, conductorViejo.getSaldo());
    }

    @Test
    void testRestarCosto(){
        assertEquals(0, pasajero.getSaldo());
        pasajero.cargarSaldo(100);
        assertEquals(90, pasajero.getSaldo());
        pasajero.restarCosto(50);
        assertEquals(40, pasajero.getSaldo());
    }
}
