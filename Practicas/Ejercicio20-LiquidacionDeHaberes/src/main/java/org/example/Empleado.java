package org.example;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Empleado {
    private List<Contrato> contratos; // Interpreto que son contratos pasados
    private Contrato contratoActivo;
    private String nombre;
    private String apellido;
    private String cuil;
    private LocalDate fechaNacimiento;
    private int cantidadDeHijos;
    private boolean conyuge;
    private ReciboDeSueldo reciboDeSueldo;

    public Empleado(int cantidadDeHijos, boolean conyuge, String nombre, String apellido, String cuil, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.fechaNacimiento = fechaNacimiento;
        this.contratos = new ArrayList<>();
        this.cantidadDeHijos = cantidadDeHijos;
        this.conyuge = conyuge;
    }

    public void agregarContratoActivo(Contrato contrato){
        if(contrato.activo()){
            this.contratoActivo = contrato;
        }
    }
    public void terminarContratoActivo(Contrato contrato){
        this.contratos.add(contrato);
        this.contratoActivo = null;
    }

    private int calculoAntiguiedad(){
        int antiguedad = this.contratos.stream().mapToInt(Contrato::antiguedad).sum() + contratoActivo.antiguedad();
        return  antiguedad;
    }
    public double calcularSueldoAdicional(){
        int antiguedad = this.calculoAntiguiedad();
        if (antiguedad > 5){
            return 0.30 * contratoActivo.montoBasico();
        }
        if (antiguedad > 10){
            return 0.50 * contratoActivo.montoBasico();
        }
        if (antiguedad > 15){
            return 0.70 * contratoActivo.montoBasico();
        }
        if (antiguedad > 20){
            return 1.00 * contratoActivo.montoBasico();
        }
        return 0;
    }
    public void generarRecibo(){

        reciboDeSueldo = new ReciboDeSueldo(this.calcularSueldo(), this.nombre, this.apellido, this.cuil, this.fechaNacimiento, this.cantidadDeHijos, this.conyuge);
    }
}
