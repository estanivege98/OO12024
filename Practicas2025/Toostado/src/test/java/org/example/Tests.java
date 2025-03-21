package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Tests {

    private Cafe cafeFrio;
    private Cafe cafeCaliente;
    private Pedido pedido;

    @BeforeEach
    public void setUp(){
        cafeFrio = new Cafe(false, 100, false);
        cafeCaliente = new Cafe(true, 100, true);
        pedido = new Pedido();
    }

    @Test
    public void testCafeCaliente(){
        pedido.agregarProducto(cafeCaliente);
        pedido.agregarProducto(cafeCaliente);
        assertEquals(200, pedido.calcularDescuento());
    }

    @Test
    public void testCafeVariados(){
        pedido.agregarProducto(cafeCaliente);
        pedido.agregarProducto(cafeFrio);
        pedido.agregarProducto(cafeCaliente);
        assertEquals(290, pedido.calcularDescuento());
    }

    @Test
    public void testCafeFrio(){
        pedido.agregarProducto(cafeFrio);
        pedido.agregarProducto(cafeFrio);
        assertEquals(180, pedido.calcularDescuento());
    }
}
