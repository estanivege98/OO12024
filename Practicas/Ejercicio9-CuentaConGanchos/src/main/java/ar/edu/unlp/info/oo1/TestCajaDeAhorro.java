package ar.edu.unlp.info.oo1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCajaDeAhorro {
    private CajaDeAhorro caja1;

    @BeforeEach
    void setUp() {
        caja1 = new CajaDeAhorro(400);
    }

    @Test
    void testDepositar(){
        caja1.depositar(200);
        assertEquals(596, caja1.getSaldo());
    }
    @Test
    void testExtraer(){
        assertTrue(caja1.extraer(100));
        assertEquals(298, caja1.getSaldo());
    }
    @Test
    void testExtraerSinSaldo(){
        assertFalse(caja1.extraer(500));
        assertEquals(400, caja1.getSaldo());
    }
}
