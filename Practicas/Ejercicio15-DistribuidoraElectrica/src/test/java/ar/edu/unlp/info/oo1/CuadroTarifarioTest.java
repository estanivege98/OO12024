package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CuadroTarifarioTest {
    private CuadroTarifario cuadroTarifario;

    @BeforeEach
    void setUp(){
        this.cuadroTarifario = new CuadroTarifario();
    }

    @Test
    void testSetPrecioPorKWH(){
        this.cuadroTarifario.setPrecioPorKWH(10);
        assertEquals(10, this.cuadroTarifario.getPrecioPorKWH());
        this.cuadroTarifario.setPrecioPorKWH(0);
        assertEquals(0, this.cuadroTarifario.getPrecioPorKWH());
    }
}
