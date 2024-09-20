package ar.edu.unlp.info.oo1;

public class Circulo extends Cuerpo2D{
    private double radio;
    private double diametro;

    public Circulo() {
        this.radio = 0;
        this.diametro = 0;
    }

    // getters
    public double getRadio() {
        return this.radio;
    }
    public double getDiametro() {
        return this.diametro;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    // setters
    public void setRadio(double radio) {
        this.radio = radio;
        this.diametro = 2 * radio;
    }
}
