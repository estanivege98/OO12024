package ejercicio;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {
    private Cliente cliente;
    private UnicaVez unicaVez1;
    private UnicaVez unicaVez2;
    private ServicioLimpieza servicioLimpieza1;
    private ServicioLimpieza servicioLimpieza2;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente("Eduardo", "Avenida Siempreviva 740");
        servicioLimpieza1 = new ServicioLimpieza(100, 5, 400);
        servicioLimpieza2 = new ServicioLimpieza(50, 6, 400);
        unicaVez1 = new UnicaVez(LocalDate.now(), servicioLimpieza1);
        unicaVez2 = new UnicaVez(LocalDate.of(2025, 3, 30), servicioLimpieza2);
    }

    @Test
    public void testSupera(){
        cliente.agregarContratacion(unicaVez1);
        assertEquals(cliente.obtenerMontoAPagar(), 500);
    }

    @Test
    public void testNoSupera(){
        cliente.agregarContratacion(unicaVez2);
        assertEquals(cliente.obtenerMontoAPagar(), 460);
    }

    @Test
    public void testJuntos(){
        cliente.agregarContratacion(unicaVez1);
        cliente.agregarContratacion(unicaVez2);
        assertEquals(cliente.obtenerMontoAPagar(), 960);
    }
}
