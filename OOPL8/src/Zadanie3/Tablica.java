package Zadanie3;

import Zadanie1.Product;
import Zadanie2.Czekolada;
/**
 *
 * @author Monika
 */
public class Tablica {
    private static void tab(){
       Product[] product = new Product[10];
       
       product[0] = new Książka(20.2,"nazwaaaa","ppp");
       product[1] = new Dżem(20.2,"nazwaaaa","ppp");
       product[2] = new Czekolada(20.2,"nazwaaaa","ppp");
       product[3] = new Długopis(20.2,"nazwaaaa","ppp");
       product[0] = new Polopiryna(20.2,"nazwaaaa","ppp");

      
       for (int i=0; i<10; i++){
           product[i].buy();
           product[i].pokazInfo();
       }
    }
       public static void main(String[] args) {
        tab();
     
       }

   
        

    
}