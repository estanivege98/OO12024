package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
public class TestArchivo {
    private Archivo archivo;

    @BeforeEach
    void setUp(){
        this.archivo = new Archivo("Archivo1");
    }

    @Test
    void pruebaArchivo(){
        Assertions.assertEquals("Archivo1", this.archivo.getNombre());
        Assertions.assertEquals(8, this.archivo.tamañoFile());
    }
}
