package ar.edu.unlp.info.oo1;

public class CuadroTarifario {
    private double precioPorKWH;

    public CuadroTarifario(){
        this.precioPorKWH = 0;
    }

    public double getPrecioPorKWH(){
        return this.precioPorKWH;
    }

    public void setPrecioPorKWH(double precioPorKWH){
        this.precioPorKWH = precioPorKWH;
    }
}
