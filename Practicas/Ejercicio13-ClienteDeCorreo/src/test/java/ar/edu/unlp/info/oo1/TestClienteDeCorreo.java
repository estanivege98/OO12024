package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
public class TestClienteDeCorreo {
    private ClienteDeCorreo cliente;
    private Carpeta inbox;
    private Carpeta spam;
    private Email email1;
    private Email email2;

    @BeforeEach
    void setUp() throws Exception{
        this.inbox = new Carpeta("Inbox");
        this.cliente = new ClienteDeCorreo(this.inbox);
        this.spam = new Carpeta("Spam");
        this.email1 = new Email("Email1", "Texto del email");
        this.email2 = new Email("EmailSpam", "RECIBE UN FERRARI GRATIS!");

        this.cliente.recibir(email1);
    }

    @Test
    void testRecibirYMover(){
        Assertions.assertEquals(1, this.inbox.getEmails().size());
        this.cliente.mover(this.email1, this.inbox, this.spam);
        Assertions.assertEquals(0, this.inbox.getEmails().size());
        Assertions.assertEquals(1, this.spam.getEmails().size());
    }

    @Test
    void testBuscar(){
        this.cliente.recibir(email2);
        Assertions.assertEquals(this.email1, this.cliente.buscar("Email1"));
        Assertions.assertNotEquals(this.cliente.buscar("Ferrari"), this.email2);
    }

    @Test
    void testEspacioOcupado(){
        Assertions.assertEquals(21, this.cliente.espacioOcupado());
        this.cliente.recibir(email2);
        Assertions.assertEquals(55, this.cliente.espacioOcupado());
    }
}
