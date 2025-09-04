/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2000_introduccionprogra;

import java.util.Scanner;
import logic.*;
import domain.Person;
import domain.SavingAccount;
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
        
        Person client1 = 
        new Person("Edgardo", "Corrales", "1-2323-4545", "45456789", 18);
        
        SavingAccount account1 = 
        new SavingAccount("2025-09-04", 12, 5, "1000567801", 25000, client1);
        
        //Simulation of deposit of 3000colones in the account
        account1.deposit(3000);
        
        
        
        System.out.println(account1.toString());
        
        System.out.println("\n\n\n--------------------------------------------");
        System.out.println("Withdraw of money");
        System.out.println("--------------------------------------------\n\n");
        
        account1.withdraw(16000);
        
        System.out.println(account1.toString());
        
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
     
       //Person p = new Person("Yudhansen", "Paniagua"
       //        , "3-0808-5656", "12123434", 20);
       
       // System.out.println(p.toString());

      /* 
       Ejercicios_Semana2_PracticaEnClase ej;
       ej = new Ejercicios_Semana2_PracticaEnClase();
       //    ej.quiz2_B_piramide(5);
       LaboratorioX lab = new LaboratorioX();
       lab.ejercicioX_cuadrado(3);
        */
    }
    
}
