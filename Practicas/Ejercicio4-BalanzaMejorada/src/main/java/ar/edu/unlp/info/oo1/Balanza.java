package ar.edu.unlp.info.oo1;
import java.util.*;
import ar.edu.unlp.info.oo1.*;
public class Balanza {
    private int cantidadDeProductos;
    private List<Producto> productos;

    public Balanza() {
        this.productos = new ArrayList<Producto>();
        this.cantidadDeProductos = 0;
    }

    public void ponerEnCero() {
        this.productos.clear();
        this.cantidadDeProductos = 0;
    }

    public void agregarProducto(Producto prod) {
        this.productos.add(prod);
        cantidadDeProductos++;
    }

    public Ticket emitirTicket(){
        double precioTotal = this.getPrecioTotal();
        double pesoTotal = this.getPesoTotal();
        return new Ticket(this.getPrecioTotal(), this.getPesoTotal(), this.cantidadDeProductos);
    }

    // getters
    public List<Producto> getProductos(){
        return this.productos;
    }
    public double getPrecioTotal() {
        return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
    public double getPesoTotal() {
        return this.productos.stream().mapToDouble(Producto::getPeso).sum();
    }


}
