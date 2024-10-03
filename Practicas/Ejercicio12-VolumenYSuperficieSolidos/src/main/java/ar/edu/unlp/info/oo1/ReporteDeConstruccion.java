package ar.edu.unlp.info.oo1;
import java.util.*;
public class ReporteDeConstruccion {
    private List<Pieza> piezas;

    public ReporteDeConstruccion(){
        this.piezas = new ArrayList<>();
    }
    public double getVolumenDeMaterial(String nombreDeMaterial){
        return this.piezas.stream().filter(pieza -> pieza.getMaterial().equals(nombreDeMaterial)).mapToDouble(Pieza::getVolumen).sum();
    }

    public double getSuperficieDeColor(String color){
        return this.piezas.stream().filter(pieza -> pieza.getColor().equals(color)).mapToDouble(Pieza::getSuperficie).sum();
    }

    public void agregarPieza(Pieza pieza){
        this.piezas.add(pieza);
    }
}
