/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class MovilParabolico {
    
    final double gravedad = 9.8;
    double vInicial;
    double angulo; 
    double Vx, Vy;
    double Dx, Hy, Dmax, Hmax;
    double tiempo;
    
    public MovilParabolico(){
        
    }
    
    public void Datos(){
    tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo: "));
    vInicial = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la velocidad inicial: "));
    angulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el angulo: "));
    }

    public void Velocidades( double ang, double vIni){ 
        Vx = vIni*cos(ang*Math.PI/180);
        Vy = vIni*sin(ang*Math.PI/180);
    }
    
    public double velX(double ang, double vIni){
        Vx = vIni*cos(ang*Math.PI/180);
        return Vx;
    }
    
    

    public void Altura(){
        if(Dx > Dmax){
            Hy = vInicial*sin(angulo*Math.PI/180)*tiempo - 0.5*gravedad*pow(tiempo, 2);
        }
        else{
            Hy = vInicial*sin(angulo*Math.PI/180)*tiempo + 0.5*gravedad*pow(tiempo, 2);
        }
        Hmax = pow( vInicial*sin(angulo*Math.PI/180), 2)/2*gravedad;
    }

    public void Distancia(){
        Dx = vInicial*cos(angulo*Math.PI/180)*tiempo;
        Dmax = pow( vInicial, 2)*sin(2*angulo*Math.PI/180)/gravedad;
    }

    public void Resultados(){
        System.out.println("El tiempo de ejecucion es: "+tiempo);
        System.out.println("La velocidad en el eje x es: "+Vx);
        System.out.println("La velocidad en el eje y es: "+Vy);
        System.out.println("La distancia es: "+Dx);
        System.out.println("La altura es: "+Hy);
        System.out.println("La altura maxima posible es: "+Hmax);
        System.out.println("El alcance: "+Dmax);
    }
}



