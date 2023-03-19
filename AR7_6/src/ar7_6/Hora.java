/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_6;

/**
 *
 * @author jlu
 */
public class Hora {

    private byte hora;
    private byte minuto;
    private byte segundo;
    
    public int getHora(){
        return hora;
    }
    
    public void setHora(int hora){
        if (0<=hora && hora<=23){
            this.hora=(byte)hora;
        }else{
            this.hora = 0;
        }
    }
        
    public int getMinuto(){
        return minuto;
    }
    
    public void setMinuto(int minuto){
        this.minuto=(byte)minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public void setSegundo(int segundo){
        this.segundo=(byte)segundo;
    }
    
    public void incre(){
        segundo++;
        if (segundo==60){
            segundo=0;
            minuto++;
                if (minuto==60){
                minuto=0;
                hora++;
                   if (hora==24){
                    hora=0;
                   }
                }
        }
    }
            
    
    
}

