/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_5;

/**
 *
 * @author jlu
 */
public class cc {
    String dni;
    String nombre;
    Double saldo;
    Gestor gestor;

    cc(String dni, String nombre, Gestor gestor){
    this (dni,nombre);
    this.gestor = gestor;
    }
    
    cc(String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        saldo = 0.0;
    }

    void setGestor(Gestor gestor){
        this.gestor = gestor;
    }
    
    void egreso(double cant){
        saldo -= cant;
    }

    void ingreso(double cant){
        saldo += cant;
    }
    
    void mostrarInformacion(){
        if (gestor==null){
            System.out.println("Cuenta sin gestor");
        }else{
            System.out.println("Informacion del gestor");
            gestor.mostrarInformacion();
        }
        System.out.println("Informacion de la cuenta:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Dni: "+dni);
        System.out.println("saldo: "+saldo);
    }
    
}
