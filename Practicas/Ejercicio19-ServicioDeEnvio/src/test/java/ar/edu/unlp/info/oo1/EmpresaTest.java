package ar.edu.unlp.info.oo1;
import jdk.dynalink.beans.StaticClass;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
public class EmpresaTest {
    private Empresa empresa;
    private PersonaFisica personaFisica;
    private ClienteCorporativo clienteCorporativo;
    private EnvioLocal envioLocal;
    private EnvioInternacional envioInternacional;
    private EnvioInterurbano envioInterurbano;
    
    @BeforeEach
    void setUp(){
        empresa = new Empresa();
        personaFisica = new PersonaFisica("Juan Perez", "Calle Falsa 123", 41670556);
        clienteCorporativo = new ClienteCorporativo("Empresa S.A.", "Calle Falsa 456", 123456789);
    }
    
    @Test
    void testEnviarEnvioLocal(){
        envioLocal = new EnvioLocal("Calle Falsa 123", "Calle Falsa 456", LocalDate.now(), 1000, "Entrega Rapida");
        empresa.enviar(personaFisica,envioLocal);
        assertEquals(1, empresa.getEnvios().size());
    }
    
    @Test
    void testEnviarEnvioInternacional(){
        envioInternacional = new EnvioInternacional("Calle Falsa 123", "Calle Falsa 456", LocalDate.now(), 1000);
        empresa.enviar(personaFisica,envioInternacional);
        assertEquals(1, empresa.getEnvios().size());
    }
    
    @Test
    void testEnviarEnvioInterurbano(){
        envioInterurbano = new EnvioInterurbano("Calle Falsa 123", "Calle Falsa 456", LocalDate.now(), 1000, 2);
        empresa.enviar(personaFisica,envioInterurbano);
        assertEquals(1, empresa.getEnvios().size());
    }
    
    @Test
    void testMontoAPagarPersonaFisica(){
        envioLocal = new EnvioLocal("Calle Falsa 123", "Calle Falsa 456", LocalDate.now(), 1000, "Entrega Rapida");
        empresa.enviar(personaFisica,envioLocal);
        assertEquals(1350, empresa.montoAPagar(personaFisica, LocalDate.now().minusDays(1), LocalDate.now().plusDays(1)));
    }
    
    @Test
    void testMontoAPagarClienteCorporativo1Kg(){
        envioLocal = new EnvioLocal("Calle Falsa 123", "Calle Falsa 456", LocalDate.now(), 1000, "Entrega Rapida");
        empresa.enviar(clienteCorporativo,envioLocal);
        assertEquals(1500, empresa.montoAPagar(clienteCorporativo, LocalDate.now().minusDays(1), LocalDate.now().plusDays(1)));
    }
    
    @Test
    void testMontoAPagarClienteCorporativo2Kg(){
        envioLocal = new EnvioLocal("Calle Falsa 123", "Calle Falsa 456", LocalDate.now(), 2000, "Entrega Rapida");
        empresa.enviar(clienteCorporativo,envioLocal);
        assertEquals(1500, empresa.montoAPagar(clienteCorporativo, LocalDate.now().minusDays(1), LocalDate.now().plusDays(1)));
    }
}
