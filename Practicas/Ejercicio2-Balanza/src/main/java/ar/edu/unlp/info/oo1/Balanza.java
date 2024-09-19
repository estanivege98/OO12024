package ar.edu.unlp.info.oo1;

public class Balanza {
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    public Balanza() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
    }

    public void ponerEnCero() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
    }

    public void agregarProducto(Producto prod) {
        this.cantidadDeProductos++;
        this.precioTotal += prod.getPeso() * prod.getPrecioPorKilo();
        this.pesoTotal += prod.getPeso();
    }

    public Ticket emitirTicket(){
        return new Ticket(this.precioTotal, this.pesoTotal, this.cantidadDeProductos);
    }

    // getters
    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }


}
