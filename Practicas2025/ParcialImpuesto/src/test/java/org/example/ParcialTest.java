package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class ParcialTest {

    private Contribuyente contribuyente1;
    private Contribuyente contribuyente2;

    private Embarcacion embarcacion1;
    private Embarcacion embarcacion2;

    private Automotor automotor1;
    private Automotor automotor2;

    private Inmueble inmueble1;

    @BeforeEach
    public void setUp() {
        contribuyente1 = new Contribuyente("Juan", 12345678, "Calle Falsa 123", "a@gmail.com");
        contribuyente2 = new Contribuyente("Maria", 87654321, "Avenida Siempre Viva 456", "b@gmail.com");

        embarcacion1 = new Embarcacion("ABC123", LocalDate.of(2020, 1, 1), 1500000, contribuyente1, "Yate de Lujo");
        embarcacion2 = new Embarcacion("DEF456", LocalDate.of(2018, 5, 15), 800000, contribuyente2, "Barco de Pesca");

        automotor1 = new Automotor("GHI789", LocalDate.of(2004, 3, 10), 200000, contribuyente1, "Toyota", "Corolla");
        automotor2 = new Automotor("JKL012", LocalDate.of(2021, 7, 20), 300000, contribuyente2, "Ford", "Focus");

        inmueble1 = new Inmueble(12345, 500000, 300000, contribuyente1);
    }

    @Test
    public void testContribuyente1(){
        assertEquals(233000, contribuyente1.calcularImpuesto());
    }

    @Test
    public void testContribuyente2(){
        assertEquals(95000, contribuyente2.calcularImpuesto());
    }

}
