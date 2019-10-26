/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

/**
 *
 * @author tri
 */
public class MovilRectilineoUniforme {
    
    private final double velocidad;
    private double posicion;
    
    public MovilRectilineoUniforme(double v){
        this.velocidad = v;
        this.posicion = 0.0;
    }
    
    public void setPosicion( double t ){
        this.posicion = velocidad * t;
    }
    
    public double getPosition(){
        return this.posicion;
    }
    
}
