/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7_9.array.de.objetos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class AR7_9ArrayDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean bo=false;
        Bombilla b[]= new Bombilla[0];
        b=Arrays.copyOf(b,b.length+1);        
        b[0] = new Bombilla(true);
        b[0].apaga();
        b=Arrays.copyOf(b,b.length+1);        
        b[1] = new Bombilla(false);
        b[1].apaga();
        n=b.length;
        b=Arrays.copyOf(b,b.length+1);
        System.out.println("Introducir estado de la bombilla nº: "+b.length);
        System.out.println("0. -Apagado");
        System.out.println("1. - Encendido");
        n=sc.nextInt();
        if (n==0) bo=false;
            else
            if (n==1) bo=true;
        b[2] = new Bombilla(bo);
        n=b.length;
        b[0].visuBombilla(b);
        b[0].menu(b);
        b[2].visuBombilla(b);
    }
}
