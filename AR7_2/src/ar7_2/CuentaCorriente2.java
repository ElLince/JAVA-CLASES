/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_2;

/**
 *
 * @author JAVA
 */
public class CuentaCorriente2 {
    String dni;
    String nombre;
    double saldo;

    CuentaCorriente2(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }
    CuentaCorriente2(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }
    CuentaCorriente2(String dni, String nombre, double saldo){
        this.dni = dni;
        this.nombre = nombre;        
        this.saldo = saldo;

    }

    boolean egreso(double cant){
        boolean operacionPosible;
        if (saldo >= cant){
            saldo -= cant;
            operacionPosible = true;
        }else{ 
            System.out.println("No hay dinero suficiente: ");
            operacionPosible = false;
        }
        return (operacionPosible);
        }
    void ingreso(double cant){
        saldo+=cant;
    }
    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " ");
        System.out.println("Dni: " +dni+ " ");
        System.out.println("Saldo: " + saldo + " euros ");
    }
}

