package org.example;
import org.junit.jupiter.api.*;

import java.util.Map;

public class TestCarpeta {
    private Carpeta carpetaSinEmails;
    private Carpeta carpetaConEmails;
    private Email email1;
    private Email email2;
    private Email emailPequeño;
    private Email emailMediano;
    private Email emailGrande;

    @BeforeEach
    void setUp() throws Exception{
        this.carpetaSinEmails = new Carpeta("Carpeta Sin Emails");
        this.carpetaConEmails = new Carpeta("Carpeta Con Emails");
        this.email1 = new Email("Email1", "Texto del email");
        this.email2 = new Email("Email2", "Un Cuerpo de email");
        this.emailPequeño = new Email("Email Pequeño", "Texto del email pequeño");
        this.emailMediano = new Email("Email Mediano", "Texto del email mediano");
        this.emailGrande = new Email("Email Grande", "Texto del email grande");
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

    @Test
    void testCantidadDeEmailsPorCategoria(){
        this.carpetaConEmails.store(this.emailPequeño);
        this.carpetaConEmails.store(this.emailMediano);
        this.carpetaConEmails.store(this.emailGrande);

        Map<String, Integer> resultado = this.carpetaConEmails.cantiadEmailsPorCategoria();
        Assertions.assertEquals(3, this.carpetaConEmails.cantiadEmailsPorCategoria().get("Pequeño"));
        //Assertions.assertEquals(3, this.carpetaConEmails.cantiadEmailsPorCategoria().get("Pequeño"));
        Assertions.assertEquals(0, this.carpetaConEmails.cantiadEmailsPorCategoria().get("Grande"));
    }
}
