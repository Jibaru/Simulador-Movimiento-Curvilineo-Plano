/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Jibaru
 */
public class Polinomio {
    
    private final List<Monomio> monomios;
    
    
    public Polinomio(List<Monomio> monomios){
        this.monomios = monomios;
    }
    
    public Polinomio(String polinomio){
        String[] elementos = polinomio.split("[+]");
        monomios = new ArrayList<>();
        for (String elemento : elementos) {
            monomios.add(new Monomio(elemento));
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
        int total = monomios.size();
        for(Monomio m: monomios){
            polinomio += m.toString();
            if(i != total -1 ) polinomio += "+"; 
            i++;
        }
        return polinomio;
    }
    
    public Polinomio getDerivada(){
        List<Monomio> monomiosDeriv = new ArrayList<>();
        Polinomio p;
       
        monomios.forEach((m) -> {
            monomiosDeriv.add(m.getDerivada());
        });
       
        p = new Polinomio(monomiosDeriv);
        
        return p;
    }
}
