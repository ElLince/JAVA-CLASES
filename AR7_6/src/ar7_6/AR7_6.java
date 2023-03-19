/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7_6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jlu
 */
public class AR7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    Hora h = new Hora();
    
    System.out.print("Introducir hora: ");
    int ho = sc.nextInt();
    h.setHora(ho);
    System.out.print("Introdudir minutos: ");
    int mi = sc.nextInt();
    h.setMinuto(mi);
    System.out.print("Introdudir segundos: ");
    int se = sc.nextInt();
    h.setSegundo(se);
    System.out.println("Introducir proximos segundos a mostrar");
    int ps = sc.nextInt();
        for (int i=0; i<=ps; i++){
        System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
        h.incre();
        }
    }
}
