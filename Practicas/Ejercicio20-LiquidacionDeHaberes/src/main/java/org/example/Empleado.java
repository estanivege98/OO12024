package org.example;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Empleado {
    private List<Contrato> contratos; 
    //private Contrato contratoActivo;
    private String nombre;
    private String apellido;
    private int cuil;
    private LocalDate fechaNacimiento;
    private int cantidadDeHijos;
    private boolean conyuge;
    private ReciboDeSueldo reciboDeSueldo;

    public Empleado(int cantidadDeHijos, boolean conyuge, String nombre, String apellido, int cuil, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.fechaNacimiento = fechaNacimiento;
        this.contratos = new ArrayList<>();
        this.cantidadDeHijos = cantidadDeHijos;
        this.conyuge = conyuge;
    }

    public void agregarContrato(Contrato contrato){
        if(contrato != null){
            this.contratos.add(contrato);
            
        }
    }
    
    public Contrato obtenerContratoActivo(){
        return this.contratos.stream().
                filter(contrato -> contrato.activo()).
                findFirst().
                orElse(null);
    }

    private int calculoAntiguiedad(){
        int antiguedad = this.contratos.stream().mapToInt(Contrato::antiguedad).sum();
        return  antiguedad;
    }
    public double calcularSueldoAdicional(){
        Contrato contratoActivo = obtenerContratoActivo();
        if(contratoActivo == null){
            return 0;
        }
        int antiguedad = this.calculoAntiguiedad();
        if (antiguedad > 20){
            return 1.00 * contratoActivo.montoBasico();
        }
        if (antiguedad > 15){
            return 0.70 * contratoActivo.montoBasico();
        }
        if (antiguedad > 10){
            return 0.50 * contratoActivo.montoBasico();
        }
        if (antiguedad > 5){
            return 0.30 * contratoActivo.montoBasico();
        }
        return 0;
    }
    public void generarRecibo(){
        Contrato contratoActivo = obtenerContratoActivo();
        if (contratoActivo != null){
            reciboDeSueldo = new ReciboDeSueldo(this, contratoActivo.montoBasico(), this.calcularSueldoAdicional(), this.calculoAntiguiedad());        }
        //reciboDeSueldo = new ReciboDeSueldo(this, this.contratoActivo.montoBasico(),this.calcularSueldoAdicional(), this.calculoAntiguiedad());
    }
}
