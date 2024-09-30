package ar.edu.unlp.info.oo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlazoFijo {
    private PlazoFijo plazoFijo;
    @BeforeEach
    void SetUp(){
        plazoFijo = new PlazoFijo(LocalDate.of(2024, 9, 17));
        plazoFijo.setMontoDepositado(3000);
        plazoFijo.setPorcenajeDeInteresDiario(0.01);
    }

    @Test
    void testValorActual(){
        assertEquals(3360, plazoFijo.valorInversion());
    }
}
