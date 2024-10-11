package ar.edu.unlp.info.oo1;
import java.util.*;
public class Distribuidora {
    private CuadroTarifario cuadroTarifario;
    private List<Usuario> usuarios;
    private List<Factura> facturas = new ArrayList<Factura>();

    public Distribuidora(){
        this.cuadroTarifario = new CuadroTarifario();
        this.usuarios = new ArrayList<Usuario>();
    }
    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }
    public List<Factura> facturar(){
        double precioFact = this.cuadroTarifario.getPrecioPorKWH();
        for (Usuario usuario : this.usuarios){
            Consumo consumo = usuario.ultimoConsumo();
            if (consumo != null){
                Factura factura = usuario.generarFactura(consumo, precioFact);
                this.facturas.add(factura);
            }
        }
        return this.facturas;
    }
}
