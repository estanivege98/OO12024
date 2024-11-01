package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
public class EnvioTest {
    private Envio envioLocal;
    private Envio envioInterurbano;
    private Envio envioInternacional;
    private Cliente clienteCorporativo;
    private Cliente clientePersonaFisica;

    @BeforeEach
    void setUp(){
        clienteCorporativo = new ClienteCorporativo("Cliente Corporativo", "Direccion Cliente Corporativo", 123456789);
        clientePersonaFisica = new PersonaFisica("Cliente Persona Fisica", "Direccion Cliente Persona Fisica", 123456789);

    }

    @Test
    void testEnvioLocalRapido(){
        envioLocal = new EnvioLocal("Origen", "Destino", LocalDate.now(), 1000, "Entrega Rapida");
        assertEquals(1500, envioLocal.costo());
    }

    @Test
    void testEnvvioLocalNormal(){
        envioLocal = new EnvioLocal("Origen", "Destino", LocalDate.now(), 1000, "Normal");
        assertEquals(1000, envioLocal.costo());
    }

    @Test
    void testEnvioInterurbanoMenos100Km(){
        envioInterurbano = new EnvioInterurbano("Origen", "Destino", LocalDate.now(), 1000, 50);
        assertEquals(20000, envioInterurbano.costo());
    }

    @Test
    void testEnvioInterurbanoMenos500Km(){
        envioInterurbano = new EnvioInterurbano("Origen", "Destino", LocalDate.now(), 1000, 250);
        assertEquals(25000, envioInterurbano.costo());
    }

    @Test
    void testEnvioInterurbanoMas500Km(){
        envioInterurbano = new EnvioInterurbano("Origen", "Destino", LocalDate.now(), 1000, 750);
        assertEquals(30000, envioInterurbano.costo());
    }

    @Test
    void testEnvioInternacionalMenos1Kg(){
        envioInternacional = new EnvioInternacional("Origen", "Destino", LocalDate.now(), 750);
        assertEquals(12500, envioInternacional.costo());
    }

    @Test
    void testEnvioInternacionalMas1Kg(){
        envioInternacional = new EnvioInternacional("Origen", "Destino", LocalDate.now(), 1500);
        assertEquals(42500, envioInternacional.costo());
    }

}
