/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_11.nodosenteros;
import java.util.Arrays;

/**
 *
 * @author JAVA
 */
public class Nodo {
    Integer tabla[];

    public Nodo(){
        tabla = new Integer[0];
    }
    void inserPrinci(Integer nuevo){
        tabla=Arrays.copyOf(tabla,tabla.length+1);
        System.arraycopy(tabla,0,tabla,1,tabla.length-1);
        tabla[0] = nuevo;
    }
    
    void inserFinal(Integer nuevo){
        tabla=Arrays.copyOf(tabla,tabla.length+1);
        tabla[tabla.length-1]=nuevo;
    }
    public void mostrar(){
        System.out.println("Nodo: "+Arrays.toString(tabla));
    }

    Integer eliminar(int indice){
        Integer eliminado = null;
        if (indice>=0 && indice<tabla.length){
            eliminado = tabla[indice];
            for (int i=indice + 1; i<tabla.length; i++){
                tabla[i-1]=tabla[i];
            }
            tabla=Arrays.copyOf(tabla,tabla.length-1);
        }
    return eliminado;
    }
    
    void inser(int posicion, Integer nuevo){
        tabla=Arrays.copyOf(tabla,tabla.length+1);
        System.out.println(Arrays.toString(tabla));
        System.arraycopy(tabla, posicion, tabla, posicion+1, tabla.length-posicion-1);
        tabla[posicion]=nuevo;
    }

    int buscar(Integer claveBusqueda){
        int indice=-1;
        for (int i=0; i<tabla.length && indice==-1; i++){
            if (tabla[i].equals(claveBusqueda)){
                indice = i;
            }
        }
        return indice;
    }
    
}
