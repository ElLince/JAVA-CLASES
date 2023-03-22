/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar7_13_pila;

/**
 *
 * @author JAVA
 */
public class Pila {


        private Lista lista;

        
        public Pila(){
            lista = new Lista();
        }
        
        void apilar(Integer elemento){
            lista.inserFinal(elemento);
        }
        
        Integer desapilar(){
            return lista.eliminar(lista.tabla.length-1);
        }
        public void mostrar(){
            lista.mostrar();
        }
    }
