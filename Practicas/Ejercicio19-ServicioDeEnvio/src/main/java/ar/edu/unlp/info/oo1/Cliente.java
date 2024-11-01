package ar.edu.unlp.info.oo1;

import java.util.List;

public abstract class Cliente {
    private String direccion;
    private String nombre;
    private List<Envio> envios;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public List<Envio> getEnvios() {
        return this.envios;
    }
}
