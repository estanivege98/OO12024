package ar.edu.unlp.info.oo1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class DateLapseBTest {
    private DateLapseB dateLapse;
    private LocalDate fecha;

    @BeforeEach
    void setUp() throws Exception {
        fecha = LocalDate.of(2021, 1, 1);
        dateLapse = new DateLapseB(fecha, 10);
    }

    @Test
    void testGetTo(){
        assertTrue(dateLapse.getTo().equals(LocalDate.of(2021, 1, 11)));
        assertFalse(dateLapse.getTo().equals(LocalDate.of(2021, 1, 10)));
    }
    @Test
    void testIncludesDate(){
        assertTrue(dateLapse.includesDate(LocalDate.of(2021, 1, 1)));
        assertTrue(dateLapse.includesDate(LocalDate.of(2021, 1, 11)));
        assertFalse(dateLapse.includesDate(LocalDate.of(2021, 1, 12)));
    }
}
