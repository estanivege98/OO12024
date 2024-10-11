package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class ConsumoTest {
    private Consumo consumo;
    private Consumo consumo2;
    @BeforeEach
    void setUp(){
        this.consumo = new Consumo(100, 10);
        this.consumo2 = new Consumo(100, 0);
    }

    @Test
    void testFactorDePotencia(){
        assertEquals(0.9950371902099892, this.consumo.factorDePotencia());
        assertEquals(1, this.consumo2.factorDePotencia());
    }
}
