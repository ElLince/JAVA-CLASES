/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquinaria;

/**
 *
 * @author JAVA
 */
public class Vagon {
    
    int numIdentificativo;
    int cargaMax;
    int cargaActual;
    String mercancia;
    public Vagon(int numIdentificativo, int cargaMax, int cargaActual, String mercancia){
        this.numIdentificativo = numIdentificativo;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }
}
