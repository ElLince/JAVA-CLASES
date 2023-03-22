/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7_13_pila;

/**
 *
 * @author JAVA
 */
public class AR7_13_PILA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pila p = new Pila();
        System.out.println(p.desapilar());
        for (int i=0; i<10; i++){
            p.apilar(i);
        }
        Integer num = p.desapilar();
        while (num != null){
        System.out.println(num+" ");
        num=p.desapilar();
        }
    }
}
