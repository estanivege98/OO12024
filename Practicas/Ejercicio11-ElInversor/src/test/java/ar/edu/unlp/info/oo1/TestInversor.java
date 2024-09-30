package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInversor {
    private Inversor inversor1 = new Inversor("Juan");
    private Inversor inversor2 = new Inversor("Pedro");
    private InversionEnAcciones meli = new InversionEnAcciones("meli");
    private PlazoFijo plazofijo = new PlazoFijo(LocalDate.of(2024, 9, 17));

    @BeforeEach
    void SetUp(){
        meli.setCantidad(5);
        meli.setValorUnitario(1000);

        plazofijo.setMontoDepositado(3000);
        plazofijo.setPorcenajeDeInteresDiario(0.01);

        inversor1.agregarInversion(meli);
        inversor1.agregarInversion(plazofijo);

        inversor2.agregarInversion(meli);
        inversor2.agregarInversion(plazofijo);
    }

    @Test
    void testValorInversion() {
        assertEquals(5000, meli.valorInversion());
        assertEquals(3360, plazofijo.valorInversion());
    }

    @Test
    void testInversioness(){
        assertEquals(8360, inversor1.valorActual());
        assertEquals(8360, inversor2.valorActual());
    }
}
