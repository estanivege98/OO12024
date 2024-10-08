package ar.edu.unlp.info.oo1;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class DateLapseTest {
    private DateLapse dateLapse;
    private LocalDate fecha1;
    private LocalDate fecha2;

    @BeforeEach
    void setUp(){
        fecha1 = LocalDate.of(1972, 9, 15);
        fecha2 = LocalDate.of(2032, 9, 15);
        dateLapse = new DateLapse(fecha1, fecha2);
    }

    @Test
    void testIncludeDate(){
        LocalDate fecha3 = LocalDate.of(2000, 9, 15);
        LocalDate fecha4 = LocalDate.of(2032, 9, 14);
        LocalDate fecha5 = LocalDate.of(2032, 9, 16);
        LocalDate fecha6 = LocalDate.of(1972, 9, 14);
        LocalDate fecha7 = LocalDate.of(1972, 9, 16);
        LocalDate fecha8 = LocalDate.of(1972, 9, 16);
        Assertions.assertTrue(dateLapse.includesDate(fecha3));
        Assertions.assertTrue(dateLapse.includesDate(fecha4));
        Assertions.assertFalse(dateLapse.includesDate(fecha5));
        Assertions.assertFalse(dateLapse.includesDate(fecha6));
        Assertions.assertTrue(dateLapse.includesDate(fecha7));
        Assertions.assertTrue(dateLapse.includesDate(fecha8));
    }

    @Test
    void testSizeInDays(){
        Assertions.assertEquals(21915, dateLapse.sizeInDays());
    }
}
