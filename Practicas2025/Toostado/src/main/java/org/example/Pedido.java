package org.example;
import java.util.ArrayList;
import java.util.List;
public class Pedido {
    private List<Producto> productos;
    private boolean pagado;
    private IPromociones promociones;

    public Pedido(){
        this.pagado = false;
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }


    public double calcularDescuento(){
        double productoDescuentos = this.productos.stream()
                .mapToDouble(producto -> producto.getPrecio() - producto.getPrecio()*promociones.promo())
                .sum();
        return productoDescuentos;
    }
}

