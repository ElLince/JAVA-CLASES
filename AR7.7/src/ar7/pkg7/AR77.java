/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7.pkg7;

/**
 *
 * @author jlu
 */
public class AR77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Texto t= new Texto(5);
        t.addPrincipio("He");
        t.addPrincipio(";");
        t.addFinal("llo");
        t.mostrar();
        System.out.println("El numero de vocales es: "+ t.numVocales());
        

    }
}
