package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class TestCuentaCorriente {
    private CuentaCorriente cuenta;
    @BeforeEach
    void setUp() {
        cuenta = new CuentaCorriente(100);
        cuenta.setDescubierto(500);
    }

    @Test
    void testDepositar(){
        cuenta.depositar(200);
        assertEquals(300, cuenta.getSaldo());
    }

    @Test
    void testExtraer(){
        assertTrue(cuenta.extraer(100));
        assertEquals(0, cuenta.getSaldo());
    }

    @Test
    void testExtraer2(){
        assertTrue(cuenta.extraer(400));
        assertEquals(-300, cuenta.getSaldo());
    }
}
