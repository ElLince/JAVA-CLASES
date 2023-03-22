/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquinaria;
import Personal.Mecanico;

public class Locomotora {
    String matricula;
    int potencia;
    int añoFabricacion;
    Mecanico mec;
    public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec){
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mec = mec;
    }
    
    
}
