/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_9.array.de.objetos;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class Bombilla {
    Scanner sc = new Scanner(System.in);
    
    boolean inte=false;
    
    public Bombilla(boolean boo){
        inte=boo;
    }
    
    void enciende(){
        inte=true;
    }

    void apaga(){
        inte=false;
    }
    
    void visuBombilla(Bombilla pa[]){
        for (int i=0; i<pa.length; i++){
            System.out.println("La bombilla " +(i+1)+" es "+pa[i].inte);
        
        }
    }
    
    void menu(Bombilla pa[])  {
        System.out.println("");
        System.out.println("1.- Visualizar bombilla");        
        System.out.println("2.- Añadir bombilla");
        System.out.println("3.- Eliminar bombilla");
        System.out.println("4.- Encender bombilla");
        System.out.println("5.- Apagar bombilla");
        System.out.println("");
    }
        
}
