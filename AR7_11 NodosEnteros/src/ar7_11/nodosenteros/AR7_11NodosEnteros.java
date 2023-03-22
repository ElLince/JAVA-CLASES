/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7_11.nodosenteros;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class AR7_11NodosEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Nodo no;
        no= new Nodo();
        int n=0;
        System.out.println("Introducir numero a insertar: ");
        System.out.println("0 para salir:");
        n=sc.nextInt();
        while (n!=0){
            no.inserFinal(n);
            System.out.print("Introducir numero a insertar: ");
            n=sc.nextInt();            
        }
        no.mostrar();
        no.inserPrinci(1);
        no.mostrar();
        no.inser(3,2);
        no.mostrar();        
        System.out.println("El digito 2 esta en la posicion "+no.buscar(2));
        no.inserPrinci(0);
        no.mostrar();        
    }   
}
