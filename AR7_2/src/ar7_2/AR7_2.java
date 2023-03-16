/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7_2;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class AR7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc= new Scanner (System.in);
        CuentaCorriente2 c;
        c = new CuentaCorriente2("70987K","ibanks");
        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros " + c.egreso(700));
        c.mostrarInformacion();
        System.out.println("Puedo sacar 500 euros " + c.egreso(500));
        c.ingreso(2000);
        c.mostrarInformacion();        
        c.egreso(100);
        c = new CuentaCorriente2("70987K","ibanks",1000);
        int opcion;
        do {
        System.out.println("");
        System.out.println("___________MENU_______________");
        System.out.println("1.- Ingresar 100 euros ");
        System.out.println("2.- Sacar 100 euros ");        
        System.out.println("3.- Mostrar informacion ");
        System.out.println("0.- Salir del menu ");
        System.out.print("Elegir opcion: ");
        opcion= sc.nextInt();
        System.out.println("");
        switch(opcion){
            case 1: {c.ingreso(100); break;}
            case 2: {c.egreso(100); break;}
            case 3: {c.mostrarInformacion(); break;}            
            default: System.out.println("Elegir una opcion de 1 a 3");
            }
        }
        while (opcion!=0);

        }
}


      
