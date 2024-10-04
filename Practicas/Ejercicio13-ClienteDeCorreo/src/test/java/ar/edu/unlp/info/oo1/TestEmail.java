package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
public class TestEmail {
    private Email email;

    @BeforeEach
    void setUp() throws Exception{
        this.email = new Email("Email1", "Texto del email");
    }

    @Test
    void testContieneTexto(){
        Assertions.assertTrue(this.email.contieneTexto("Email1"));
        Assertions.assertTrue(this.email.contieneTexto("Texto"));
        Assertions.assertFalse(this.email.contieneTexto("Email2"));
    }

    @Test
    void testTamañoMailY(){
        Assertions.assertEquals(21, this.email.tamañoMail());
    }

    @Test
    void testAgregarAdjunto(){
        Archivo arch = new Archivo("Archivo1");
        this.email.agregarAdjunto(arch);
        Assertions.assertEquals(1, this.email.adjuntos().size());

    }
}
