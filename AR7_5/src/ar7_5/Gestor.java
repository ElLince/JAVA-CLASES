/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_5;

/**
 *
 * @author jlu
 */
public class Gestor {
    public String nombre;
    private String tlf;
    double importeMax;

    public Gestor (String nombre, String tlf, double importeMax){
        this.nombre=nombre;
        this.tlf=tlf;
        this.importeMax=importeMax;
    }
   
    public Gestor(String nombre, String tlf){
        this(nombre,tlf,10000);
    }
    
    String getTlf(){
        return tlf;
    }
    void mostrarInformacion(){
        System.out.println("Nombre "+ nombre);
        System.out.println("Telefono "+ tlf);        
        System.out.println("Importe Maximo "+ importeMax);        
    }
}
