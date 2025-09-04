/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author rolan
 */
public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
    
    public void quiz2_A_primos(){
    
    }
    
    public void quiz2_B_piramide(int n){   
        /*       
           *        
         * * *
       * * * * *     
        */      
        for (int i = 1; i <= n ; i++) {
            //controla los espacios vacios
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }//endForInterno_A
            //controla los *s de la piramide
            for (int k = 1; k <=(2*i-1); k++) {
                System.out.print("*");
            }//endForInterno B
            System.out.println("");
        }//endForExterno    
    }//endMetodo
    
    public void ejercicioA(){
    
        
        
    }
 
    
    
}
