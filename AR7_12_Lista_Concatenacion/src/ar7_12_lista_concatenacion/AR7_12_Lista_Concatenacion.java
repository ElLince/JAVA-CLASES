/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7_12_lista_concatenacion;

/**
 *
 * @author JAVA
 */
public class AR7_12_Lista_Concatenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        l1.inserFinal(1);
        l1.inserFinal(1);        
        l1.inserFinal(2);
        l1.inserFinal(3);        
        l2.inserFinal(10);        
        l2.inserFinal(20);        
        l2.inserFinal(30);                
        Lista conca = Lista.concatena(l1,l2);
        conca.mostrar();
        l1.mostrar2();
    }
}
