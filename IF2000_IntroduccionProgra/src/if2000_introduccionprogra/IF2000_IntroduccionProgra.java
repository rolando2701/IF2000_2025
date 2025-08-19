/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2000_introduccionprogra;

import java.util.Scanner;
import logic.Ejercicios;
import domain.Person;
/**
 *
 * @author rolan
 */
public class IF2000_IntroduccionProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Data types
        //Python:
        //print('Hola Mundo')
        
        /*
        Tipos de datos numéricos:
        int, long, short, float, double
        numeric, money, decimal
        
        Manejo de fechas:
        Date
        
        Cadenas de caracteres:
        String,char
        
        Objectos:
        Object
        
        Data Structures:
        Arrays or Vectors: int[] x;
                           int[][] y;
        
        True/False:
        boolean 
        
        */
//        Scanner sc = new Scanner(System.in);
//        Ejercicios e = new Ejercicios();
//        System.out.println("Ingrese un num");
//        //System.out.println("Es capicua? "+e.capicua(sc.nextInt()));
//        e.sumNum(sc.nextInt());
     
       Person p = new Person("Yudhansen", "Paniagua"
               , "3-0808-5656", "12123434", 20);
       
        System.out.println(p.toString());

    }
    
}
