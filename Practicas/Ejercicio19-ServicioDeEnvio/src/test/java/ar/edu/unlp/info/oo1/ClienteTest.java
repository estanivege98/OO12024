package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
public class ClienteTest {
    private Cliente personaFisica;
    private Cliente clienteCorporativo;

    @BeforeEach
    void setUp(){
        personaFisica = new PersonaFisica("Persona Fisica", "Direccion Persona Fisica", 123456789);
        clienteCorporativo = new ClienteCorporativo("Cliente Corporativo", "Direccion Cliente Corporativo", 123456789);
    }

    @Test
    void testDescuentoPersonaFisica(){
        Envio envio = new EnvioLocal("Origen", "Destino", LocalDate.now(), 1000, "Entrega Rapida");
        LocalDate fechaInicio = LocalDate.now().minusDays(1);
        LocalDate fechaFin = LocalDate.now().plusDays(1);
        personaFisica.getEnvios().add(envio);
        assertEquals(1350, personaFisica.calcularMonto(fechaInicio, fechaFin));
    }

    @Test
    void testEnvioClienteCorporativo(){
        Envio envio = new EnvioLocal("Origen", "Destino", LocalDate.now(), 1000, "Entrega Rapida");
        LocalDate fechaInicio = LocalDate.now().minusDays(1);
        LocalDate fechaFin = LocalDate.now().plusDays(1);
        clienteCorporativo.getEnvios().add(envio);
        assertEquals(1500, clienteCorporativo.calcularMonto(fechaInicio, fechaFin));
    }
}
