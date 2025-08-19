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
public class Ejercicios {

    public Ejercicios() {
    }
      
    public boolean capicua(int n){
        int numOriginal = n;
        int numInvertido = 0;
        int digito=0;
        
        while(n>0){
            digito = n % 10;
            numInvertido=(numInvertido*10)+digito;
            n = n/10;
        }
        
        if(numInvertido==numOriginal)
            return true;
        else
            return false;
    
    }//end capicua
    
    public void sumNum(int n){
       //123= 1+2+3= 6
        int numOriginal = n;
        int numSumado = 0;
        int digito=0;
        
        while(n>0){
            digito = n % 10;
            numSumado=numSumado+digito;
            n = n/10;
        }
        
        System.out.println("La suma de los digitos de: "+numOriginal+" es: "+numSumado);
        
    }
    
}
