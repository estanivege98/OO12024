package ar.edu.unlp.info.oo1;
import java.util.*;
public class Usuario {
    public String nombre;
    public String apellido;
    public List<Consumo> consumos;
    public List<Factura> facturas;

    public Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.consumos = new ArrayList<Consumo>();
        this.facturas = new ArrayList<Factura>();
    }

    public Consumo ultimoConsumo(){
        if (this.consumos.isEmpty()){
            return null;
        }
        else return this.consumos.get(this.consumos.size() - 1);
    }

    public Factura generarFactura(Consumo consumo, double precioFactura){
        Factura factura = new Factura(this, consumo, precioFactura);
        this.facturas.add(factura);
        return factura;
    }
}
