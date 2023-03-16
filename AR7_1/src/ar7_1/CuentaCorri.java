/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_1;

/**
 *
 * @author JAVA
 */
public class CuentaCorri {
    String dni;
    String nombre;
    double saldo;

    CuentaCorri(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }
    CuentaCorri(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }
    CuentaCorri(String dni, String nombre, double saldo){
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
        System.out.print("Nombre: " + nombre + " ");
        System.out.print("Dni: " +dni+ " ");
        System.out.print("Saldo: " + saldo + " euros ");
    }
}

