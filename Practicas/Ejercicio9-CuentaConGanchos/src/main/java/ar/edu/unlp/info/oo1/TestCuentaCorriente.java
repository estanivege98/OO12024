package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class TestCuentaCorriente {
    private CuentaCorriente cuenta;
    @BeforeEach
    void setUp() {
        cuenta = new CuentaCorriente(400);
        cuenta.setDescubierto(500);
    }

    @Test
    void testDepositar(){
        cuenta.depositar(100);
        assertEquals(500, cuenta.getSaldo());
    }

    @Test
    void testExtraer(){
        assertTrue(cuenta.extraer(600));
        assertEquals(-200, cuenta.getSaldo());
    }
}
