/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Jibaru
 */
public class FuncionVectorial {
    
    private Polinomio funcionReali;
    private Polinomio funcionRealj;
    
    public FuncionVectorial( Polinomio i, Polinomio j ){
        this.funcionReali = i;
        this.funcionRealj = j;
    }
    
    public FuncionVectorial( String i, String j ){
        this.funcionReali = new Polinomio(i);
        this.funcionRealj = new Polinomio(j);
    }
    
    public Vector getValor(double t){
        return new Vector( this.funcionReali.getY(t), this.funcionRealj.getY(t) );
    }
    
    public double getValorI( double t ){
        return this.funcionReali.getY(t);
    }
    
    public double getValorJ( double t ){
        return this.funcionRealj.getY(t);
    }
    
    public Polinomio getFuncionI(){
        return this.funcionReali;
    }
    
    public Polinomio getFuncionJ(){
        return this.funcionRealj;
    }
    
    public FuncionVectorial getDerivada(){
        return new FuncionVectorial(
           this.funcionReali.getDerivada(),
           this.funcionRealj.getDerivada()
        );
    }
    
    public double getModulo(double t){
        return sqrt( pow(this.getValorI(t),2) + pow(this.getValorJ(t),2));
    }
    
    @Override
    public String toString(){
        return "("+funcionReali.toString()+")i + ("+funcionRealj.toString()+")j";
    }
    
}
