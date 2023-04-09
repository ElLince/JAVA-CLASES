/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aa7_17.touppercase;

/**
 *
 * @author jlu
 */
public class AA7_17ToUpperCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Codifica codi= new Codifica();
        String s="el perro de san roque",s1="";
        int n=3;
        s1=codi.codif(s,n);
        System.out.println(s);
        System.out.println(s1);
        
    }
}
