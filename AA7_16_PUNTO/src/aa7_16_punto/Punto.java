/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa7_16_punto;

/**
 *
 * @author jlu
 */
public class Punto {
    
    double x;
    double y;
    
    Punto(double a, double b){
        this.x=a;
        this.y=b;
    }

    public double distanciaX(Punto otro){
        double dis;
        dis=x-otro.x;
        return dis;
    }
    
    void desplazaX(double dx){
        this.x=this.x+dx;
    }

    void desplazaY(double dy){
        this.y=this.y+dy;
    }

    void mostrar(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);    
    }
    
}
