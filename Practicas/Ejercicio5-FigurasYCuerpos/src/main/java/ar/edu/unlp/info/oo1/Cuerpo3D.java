package ar.edu.unlp.info.oo1;

public class Cuerpo3D {
    private double altura;
    private Cuerpo2D caraBasal;
    private double radio;

    public Cuerpo3D() {
        this.altura = 0;
    }

    // getters
    public double getAltura() {
        return this.altura;
    }
    public Cuerpo2D getCaraBasal() {
        return this.caraBasal;
    }
    public double getVolumen(){
        return this.getCaraBasal().getArea() * this.getAltura();
    }
    public double getSuperficieExterior(){
        return 2 * this.getCaraBasal().getArea() + this.getCaraBasal().getPerimetro() * this.getAltura();
    }

    // setters
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setCaraBasal(Cuerpo2D caraBasal) {
        this.caraBasal = caraBasal;
    }

}
