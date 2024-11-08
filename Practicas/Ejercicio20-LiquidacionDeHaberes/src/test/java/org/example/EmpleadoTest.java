package org.example;
import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
public class EmpleadoTest {
    private Empleado empleadoCasado;
    private Empleado empleadoSoltero;
    private Empleado empleadoCasadoConHijos;
    private Empleado empleadoSolteroConHijos;
    @BeforeEach
    void setUp(){
        empleadoCasado = new Empleado(0, true, "Juan", "Perez", 123456789, LocalDate.of(1980, 6, 12));
        empleadoSoltero = new Empleado(0, false, "Edgardo", "Rodriguez", 123456789, LocalDate.of(1975, 6, 12));
        empleadoCasadoConHijos = new Empleado(2, true, "Dan", "Gordo", 123456789, LocalDate.of(1990, 6, 12));
        empleadoSolteroConHijos = new Empleado(2, false, "Miguel", "Abuelo", 123456789, LocalDate.of(1955, 6, 12));
    }
    
    
    
}
