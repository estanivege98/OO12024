package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class FacturaTest {
    private Factura facturaConBonificacion;
    private Factura facturaSinBonificacion;
    private Usuario usuarioConBonificacion;
    private Usuario usuarioSinBonificacion;
    private Consumo consumoBonificacion;
    private Consumo consumoSinBonificacion;
    private CuadroTarifario cuadroTarifario;

    @BeforeEach
    void setUp(){
        this.usuarioConBonificacion = new Usuario("Juan", "Perez");
        this.usuarioSinBonificacion = new Usuario("King", "Crimson");
        this.consumoBonificacion = new Consumo(50, 20);
        this.consumoSinBonificacion = new Consumo(100, 100);
        this.facturaConBonificacion = new Factura(this.usuarioConBonificacion, this.consumoBonificacion, 10);
        this.facturaSinBonificacion = new Factura(this.usuarioSinBonificacion, this.consumoSinBonificacion, 10);
        this.cuadroTarifario = new CuadroTarifario();
        this.cuadroTarifario.setPrecioPorKWH(10);
    }

    @Test
    void testCalculoSinBonificacion(){
        assertEquals(1000, this.facturaSinBonificacion.calcularTotal());
    }
    @Test
    void testCalculoConBonificacion(){
        assertEquals(499.9, this.facturaConBonificacion.calcularTotal());
    }
}
