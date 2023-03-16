/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7_1;

/**
 *
 * @author JAVA
 */
public class AR7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CuentaCorri c;
        c = new CuentaCorri("70987K","ibanks");
        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros " + c.egreso(700));
        c.mostrarInformacion();
        System.out.println("Puedo sacar 500 euros " + c.egreso(500));
        c.ingreso(5000);
        c.mostrarInformacion();        
        c.egreso(4000);
        System.out.println("Puedo sacar 5000 euros " + c.egreso(5000));
        c.mostrarInformacion();
        System.out.println("Puedo sacar 500 euros " + c.egreso(500));
        c = new CuentaCorri("70987K","ibanks",2000);
        
    }
}
