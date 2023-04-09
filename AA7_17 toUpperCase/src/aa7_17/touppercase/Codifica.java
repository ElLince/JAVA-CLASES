/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa7_17.touppercase;

/**
 *
 * @author jlu
 */
public class Codifica {

    String s2="";


    Codifica(){
        
    }
    
    public String codif(String a, int b){
        String result="";
        for (int i=0; i<a.length(); i++){
            result=result+((char)(a.charAt(i)+2));
            System.out.println(result);
        }

        return result;
    }
    
    
}
