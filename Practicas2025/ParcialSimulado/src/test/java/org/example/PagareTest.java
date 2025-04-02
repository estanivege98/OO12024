package org.example;
//import org.junit.jupiter.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class PagareTest{
    private Pagare pa1;
    private Pagare pa2;

    @BeforeEach
    public void setUp(){
        // pagare no vencido
        pa1 = new Pagare("Eduardo", "Jony", 1000, LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 15));
        // pagare vencido
        pa2 = new Pagare("Eduardo", "Jony", 1000, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 11, 15));
    }

    @Test
    public void testPagareNoVencido(){
        assertFalse(pa1.estaVencido());
    }

    @Test
    public void testPagareVencido(){
        assertTrue(pa2.estaVencido());
    }
}
