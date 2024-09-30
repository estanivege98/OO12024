package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInversionEnAcciones {
    private InversionEnAcciones inversion;
    @BeforeEach
    void SetUp() {
        inversion = new InversionEnAcciones("meli");
        inversion.setCantidad(5);
        inversion.setValorUnitario(1000);
    }

    @Test
    void testValorInversion() {
        assertEquals(5000, inversion.valorInversion());
    }
}
