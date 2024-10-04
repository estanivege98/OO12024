package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
public class TestCarpeta {
    private Carpeta carpetaSinEmails;
    private Carpeta carpetaConEmails;
    private Email email1;
    private Email email2;

    @BeforeEach
    void setUp() throws Exception{
        this.carpetaSinEmails = new Carpeta("Carpeta Sin Emails");
        this.carpetaConEmails = new Carpeta("Carpeta Con Emails");
        this.email1 = new Email("Email1", "Texto del email");
        this.email2 = new Email("Email2", "Un Cuerpo de email");
    }

    @Test
    void testAgregarYRemoverCorreos(){
        this.carpetaSinEmails.store(this.email1);
        Assertions.assertEquals(1, this.carpetaSinEmails.getEmails().size());
        this.carpetaSinEmails.delete(this.email1);
        Assertions.assertEquals(0, this.carpetaSinEmails.getEmails().size());
    }

    @Test
    void testMoverCorreos(){
        this.carpetaConEmails.store(this.email1);
        this.carpetaConEmails.mover(this.email1, this.carpetaSinEmails);
        Assertions.assertEquals(0, this.carpetaConEmails.getEmails().size());
        Assertions.assertEquals(1, this.carpetaSinEmails.getEmails().size());
    }

    @Test
    void testBuscarCorreo(){
        this.carpetaConEmails.store(this.email1);
        this.carpetaConEmails.store(this.email2);
        Assertions.assertEquals(this.email1, this.carpetaConEmails.searchMails("Email1"));
        Assertions.assertEquals(this.email2, this.carpetaConEmails.searchMails("Un Cuerpo"));
    }

    @Test
    void tamañoCarpeta(){
        this.carpetaConEmails.store(this.email1);
        this.carpetaConEmails.store(this.email2);
        Assertions.assertEquals(45, this.carpetaConEmails.tamañoCarpeta());
    }
}
