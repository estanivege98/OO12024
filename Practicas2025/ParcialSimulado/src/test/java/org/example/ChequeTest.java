package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
public class ChequeTest {
    private Cheque ch1;
    private Cheque ch2;

    @BeforeEach
    public void setUp(){
        // cheque no vencido
        ch1 = new Cheque("Eduardo", "Jony", 1000, LocalDate.of(2025, 10, 1));
        // cheque vencido
        ch2 = new Cheque("Eduardo", "Jony", 1000, LocalDate.of(2023, 10, 1));
    }

    @Test
    public void testChequeNoVencido(){
        assertFalse(ch1.estaVencido());
    }

    @Test
    public void testChequeVencido(){
        assertTrue(ch2.estaVencido());
    }

}
