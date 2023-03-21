/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_8;

/**
 *
 * @author JAVA
 */
public class Sinto {
    double frecu;
    
    Sinto (double frecuIni){
        if (frecuIni<80){
            frecu=80;
            }else{
            if (frecuIni>108){
                frecu=108;
                }else{
                    frecu=frecuIni;
            }
        }
    }
    
    public double down(){
        frecu-=0.5;
        comproRango(frecu);
        return(frecu);
    }
    
    public void info(){
        System.out.println("La sintonia es: "+ frecu);
    }

    public double up(){
        frecu +=0.5;
        comproRango(frecu);
        return frecu;
    }
    
    private void comproRango(double fre){
        if (fre<80) {
                frecu=108;
            }else{
            if (fre>108) {
                frecu = 80;
            }
        }
    }
    
   
}
