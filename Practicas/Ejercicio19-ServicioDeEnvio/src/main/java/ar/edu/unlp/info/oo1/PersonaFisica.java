package ar.edu.unlp.info.oo1;

public class PersonaFisica extends Cliente{
    private int DNI;

    public PersonaFisica(String nombre, String direccion, int DNI){
        super(nombre, direccion);
        this.DNI = DNI;
    }
}
