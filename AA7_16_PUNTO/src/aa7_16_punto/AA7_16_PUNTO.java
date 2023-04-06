/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aa7_16_punto;

/**
 *
 * @author jlu
 */
public class AA7_16_PUNTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Punto p = new Punto(2,3);
        p.mostrar();
        p.desplazaX(1);
        p.mostrar();
        
        Punto p2=new Punto(5,4);
        double d=p.distanciaX(p2);
        System.out.println("La distancia desde p a p2 es: "+d);
    }
}
