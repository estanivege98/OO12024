package ar.edu.unlp.info.oo1;
import java.util.*;
public class Farola {
    private boolean on;
    private List<Farola> neighbors = new ArrayList<Farola>();

    public Farola(){
        on = false;
    }

    public boolean isOn(){
        return this.on;
    }
    public boolean isOff(){
        return !this.on;
    }

    public void turnOn(){
        if (this.isOff()){
            this.on=true;
            this.getNeighbors().stream().forEach(Farola::turnOn);
        }
    }
    public void turnOff(){
        if (this.isOn()){
            this.on=false;
            this.getNeighbors().stream().forEach(Farola::turnOff);
        }
    }

    public List<Farola> getNeighbors(){
        return this.neighbors;
    }
    public void pairWithNeighbor(Farola otraFarola){
        if(!this.neighbors.contains(otraFarola)){
            this.neighbors.add(otraFarola);
            otraFarola.neighbors.add(this);
        }

    }
}
