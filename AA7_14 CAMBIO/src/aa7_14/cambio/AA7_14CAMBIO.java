/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aa7_14.cambio;

import java.util.Scanner;

/**
 *
 * @author jlu
 */
public class AA7_14CAMBIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Compra c = new Compra();
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("LA COMPRA DEL SUPERMERCADO");
            System.out.println();
            System.out.println("¿Cuánto ha costado la compra?");
            double precioCompra = sc.nextDouble();
            System.out.println();
            System.out.println("¿Con cuánto vas a pagar?");
            double pago = sc.nextDouble();
            System.out.println();
            double cambio = pago - precioCompra;
            System.out.println("----------------------------------------------------");
            System.out.println();
            if (cambio > 0) {
                System.out.println("El cambio de la compra es:");
                c.calcular(cambio);
                c.mostrarDevolucion();
            } else {
                System.out.println("Faltan monedas o billetes para pagar la compra.");
            }
            System.out.println();
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("¿Desea hacer otra compra?\nSi / No");
            respuesta = sc.next();
            respuesta = respuesta.toLowerCase();
        } while (respuesta.equals("si"));

    }
    
}
