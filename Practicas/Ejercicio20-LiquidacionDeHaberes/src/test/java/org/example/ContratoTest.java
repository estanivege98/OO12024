package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
public class ContratoTest {
    private PorHoras porHoras;
    private DePlanta dePlanta;
    private Empleado empleado;
    
    @BeforeEach
    void setUp(){
        empleado = new Empleado(0, true, "Juan", "Perez", 123456789, LocalDate.of(1980, 6, 12));
        porHoras = new PorHoras(LocalDate.of(2021, 6, 1), 3000, 100, LocalDate.of(2026, 6, 1));
        dePlanta = new DePlanta(LocalDate.of(2021, 6, 1), 30000, 1000, 1000);
    }
}
