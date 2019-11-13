/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

/**
 *
 * @author Jibaru
 */
public class Polinomio {
    
    private final Monomio[] monomios;
    
    
    public Polinomio(Monomio[] monomios){
        this.monomios = monomios;
    }
    
    public Polinomio(String polinomio){
        String[] elementos = polinomio.split("+");
        monomios = new Monomio[elementos.length];
        for(int i = 0; i < elementos.length; i++ ){
            monomios[i] = new Monomio(elementos[i]);
        }
    }
    
    public double getY(double x){
        double y = 0;
        for(Monomio m: monomios){
            y += m.getValor(x);
        }
        return y;
    }
    
    @Override
    public String toString(){
        String polinomio = "";
        int i = 0;
        int total = monomios.length;
        for(Monomio m: monomios){
            polinomio += m.toString();
            if(i != total -1 ) polinomio += "+"; 
            i++;
        }
        return polinomio;
    }
}
