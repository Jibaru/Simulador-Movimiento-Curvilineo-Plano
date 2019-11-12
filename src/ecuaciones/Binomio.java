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
public class Binomio {
    private double x;
    private final int exp;
    private final double coef;
    
    public Binomio ( double coef,int exp ){
        this.coef = coef;
        this.exp = exp;
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
    
    public Binomio getDerivada(){
        return new Binomio(this.coef*this.exp, this.exp - 1 );
    }
}

