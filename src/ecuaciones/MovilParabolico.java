package ecuaciones;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class MovilParabolico {
    
    final double gravedad = 9.8; 
    double Vx, Vy;
    double Dx, Hy, Dmax, Hmax;
    double tiempo, tVuelo,tHmax;
    double tray;

    public void Velocidades( double ang, double vIni){ 
        Vx = vIni*cos(ang*PI/180);
        Vy = vIni*sin(ang*PI/180);
    }
    
    public double velX(double ang, double vIni){
        Vx = vIni*cos(ang*PI/180);
        return Vx;
    }
    
    public double velY(double ang, double vIni){
        Vy = vIni*cos(ang*PI/180);
        return Vy;
    }

    public void Distancias(double ang, double vIni, double tiempo){
        Dx = vIni*cos(ang*PI/180)*tiempo;
        Dmax = pow(vIni, 2)*sin(2*ang*PI/180);
    }
    
    public double distX(double ang, double vIni, double tiempo){
        Dx = vIni*cos(ang*PI/180)*tiempo;
        return Dx;
    }
    public double distMax(double ang, double vIni, double tiempo){
        Dmax = pow(vIni, 2)*sin(2*ang*PI/180);
        return Dmax;
    }
    
    public void Tiempos(double vIni, double ang){
        tHmax = vIni*sin(ang*PI/180)/gravedad;
        tVuelo = 2*vIni*sin(ang*PI/180)/gravedad;
    }
    
    public double tiempoHmax(double vIni, double ang){
        tHmax = vIni*sin(ang*PI/180)/gravedad;
        return tHmax;
    }
    
    public double tiempoVuelo(double vIni, double ang){
        tVuelo = 2*vIni*sin(ang*PI/180)/gravedad;
        return tVuelo;
    }
    
    public void Alturas(double ang, double vIni, double tiempo){
        Hy = Vy*tiempo - 0.5*gravedad*pow(tiempo, 2);
        Hmax = (pow(sin(ang*PI/180)*vIni, 2))/(2*gravedad);
    }
    
    public double altura(double ang, double vIni, double tiempo){
        Hy = Vy*tiempo - 0.5*gravedad*pow(tiempo, 2);
        return Hy;
    }
    public double altMax(double ang, double vIni){
        Hmax = (pow(sin(ang*PI/180)*vIni, 2))/(2*gravedad);
        return Hmax;
    }
    
    public double Trayectoria(double vIni, double ang, double tiempo){
        double x = vIni*cos(ang*PI/180)*tiempo;
        tray = x*tan(ang*PI/180)-0.5*gravedad*pow(x/(vIni*cos(ang*PI/180)), 2);
        return tray;
    }
}