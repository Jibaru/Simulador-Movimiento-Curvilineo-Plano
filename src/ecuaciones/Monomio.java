/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

import static java.lang.Math.pow;

/**
 *
 * @author Georgette
 */
public class Monomio {
    private double x;
    private final int exp;
    private final double coef;
    
    public Monomio ( double coef,int exp ){
        this.coef = coef;
        this.exp = exp;
    }
    
    public Monomio( String binomio ){
        
        String[] elementos = binomio.split("[*^]");
        coef = Double.parseDouble(elementos[0]);
        exp  = Integer.parseInt(elementos[2]);
        
    }
    
    public double setX(double x){
        this.x = x;
        return x;
    }
    
    public double getX(){
        return this.x;
    }
    public double getValor( double x ){
        return coef*pow(x, exp);
    }
    
    public double getValor(){
        return this.coef*pow(this.x, this.exp);
    }
    
    public Monomio getDerivada(){
        return new Monomio(this.coef*this.exp, this.exp - 1 );
    }
    
    @Override
    public String toString(){
        if( coef == 0.0 ){
            return "0.0";
        }
        if( exp == 0.0 ){
            return ""+coef;
        }
        return coef+"*t^"+exp;
    }
    
}

