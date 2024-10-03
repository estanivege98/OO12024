package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
public class TestReporte {
    private ReporteDeConstruccion reporte;
    @BeforeEach
    void SetUp(){
        this.reporte = new ReporteDeConstruccion();
        this.reporte.agregarPieza(new Cilindro("Hierro", "Rojo", 5, 10));
        this.reporte.agregarPieza(new PrismaRectangular("Hierro", "Azul", 5, 2, 3));
        this.reporte.agregarPieza(new Esfera("Madera", "Verde", 3));
    }

    @Test
    void testVolumenDeMaterial(){
        Assertions.assertEquals(113.09733552923254, this.reporte.getVolumenDeMaterial("Madera"));
        Assertions.assertEquals(1835.3981633974483, this.reporte.getVolumenDeMaterial("Hierro"));
    }
    @Test
    void testSuperficieDeColor(){
        Assertions.assertEquals(113.09733552923255, this.reporte.getSuperficieDeColor("Verde"));
        Assertions.assertEquals(62.0, this.reporte.getSuperficieDeColor("Azul"));
    }
}
