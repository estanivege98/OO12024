package org.example;
import java.util.Set;
import java.util.SortedSet;

public class EvenNumberSet {
    SortedSet<Integer> set;

    public EvenNumberSet(){
        set = new java.util.TreeSet<>();
    }

    public int size(){return this.set.size();}
    public boolean contains(Integer n){
        return this.set.contains(n);
    }

    private boolean isEven(Integer n){
        return n%2 == 0;
    }
    public boolean add(Integer n){
        // Si el numero es par, lo añadimos al conjunto
        if(this.isEven(n) && !this.set.contains(n)){
            return this.set.add(n);
        }
        return false;
    }
}
