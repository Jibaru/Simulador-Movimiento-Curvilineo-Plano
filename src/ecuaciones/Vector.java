/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

import static java.lang.Math.atan;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Georgette
 */
public class Vector {
    private double i;
    private double j;
    
    public Vector(double i,double j){
        this.i = i;
        this.j = j;
    }
    
    public void setI( double i){
        this.i = i;
    }
    
    public double getI(){
        return this.i;
    }
    
    public void setJ( double j){
        this.j = j;
    }
    
    public double getJ(){
        return this.j;
    }
    
    public double getModulo(){
        return sqrt(pow(i,2) + pow(j,2));
    }
    
    public double getDireccion(){
        if(atan(j/i) < 0){
            return 360 + atan(j/i);
        }
        else{
            return atan(i/j);
        }
    }
    
    // Nota: se supone que el nuevo vector está en el eje Z, y se devuelve su valor
    public double crossBy(Vector v){
        double z1 = this.i * v.getJ();
        double z2 = this.j * v.getI();
        return z1-z2;
    }
}