package org.example;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {
    private Cliente cliente1;
    private Cliente cliente2;
    private Plan plan1;

    private Juego juego1;
    private Juego juego2;
    private Juego juego3;

    private Video video1;
    private Video video2;

    private Item item1;
    private Item item2;

    @BeforeEach

    public void setUp(){
        plan1 = new Grupal(3);
        cliente1 = new Cliente("Juan", LocalDate.of(2014, 11, 22), plan1);
        cliente2 = new Cliente("Juan", LocalDate.of(2024, 11, 22), plan1);

        juego1 = new Juego(LocalDate.now(), "192.168.0.1", 400);
        juego2 = new Juego(LocalDate.now(), "192.168.0.2", 100);
        juego3 = new Juego(LocalDate.now(), "192.168.0.3", 1000);

        video1 = new Video(LocalDate.now(), "192.168.0.4", 100, 10);
        video2 = new Video(LocalDate.now(), "192.168.0.5", 200, 10);

    }

    @Test
    public void testCliente1(){
        plan1.asignarCliente(cliente1);
        cliente1.agregarActividad(juego1);
        cliente1.agregarActividad(juego2);
        cliente1.agregarActividad(juego3);
        cliente1.agregarActividad(video1);
        cliente1.agregarActividad(video2);

        assertEquals(0, cliente1.montoPenalizacion(LocalDate.now(), LocalDate.of(2024, 11, 22)));
    }

    @Test
    public void testCliente2(){
        plan1.asignarCliente(cliente2);
        cliente2.agregarActividad(juego1);
        cliente2.agregarActividad(juego2);
        cliente2.agregarActividad(juego3);
        cliente2.agregarActividad(video1);
        cliente2.agregarActividad(video2);

        assertEquals(1000, cliente2.montoPenalizacion(LocalDate.now(), LocalDate.of(2024, 11, 22)));
    }

    @Test
    public void testMontoACobrar(){
        plan1.asignarCliente(cliente1);
        cliente1.agregarActividad(juego1);
        cliente1.agregarActividad(juego2);
        cliente1.agregarActividad(juego3);
        cliente1.agregarActividad(video1);
        cliente1.agregarActividad(video2);
        item1 = new Item("item1", 100, 3);
        item2 = new Item("item2", 200, 5);

        juego1.utilizarItem(item1);
        juego2.utilizarItem(item2);

        assertEquals(5500, cliente1.montoACobrar(LocalDate.now(), LocalDate.of(2024, 11, 22)));
    }
}
