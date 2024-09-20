package ar.edu.unlp.info.oo1;

public class Cuadrado extends Cuerpo2D{
    private double lado;

    public Cuadrado() {
        this.lado = 0;
    }

    // getters
    public double getLado() {
        return this.lado;
    }
    public double getArea() {
        return Math.pow(this.lado, 2);
    }
    public double getPerimetro() {
        return 4 * this.lado;
    }

    // setters
    public void setLado(double lado) {
        this.lado = lado;
    }

}
