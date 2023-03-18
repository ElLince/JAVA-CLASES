/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar7_5;

/**
 *
 * @author jlu
 */
public class AR7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Gestor g1,g2;
        g1=new Gestor("ge1","ge1");
        g2=new Gestor("ge2","ge2");
        cc c1 = new cc("AA","AA",g1);
        c1.mostrarInformacion();
        c1.setGestor(g2);
        c1.mostrarInformacion();
    }
    
}
