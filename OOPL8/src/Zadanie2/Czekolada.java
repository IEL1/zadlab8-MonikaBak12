package Zadanie2;

import Zadanie1.Product;

/**
 *
 * @author Monika
 */
public class Czekolada extends Product {

    public Czekolada(double price, String nazwa, String opis) {
        super(price, nazwa, opis);
    }
    
    @Override
    public void buy() {
        System.out.println("Kupiłam czekolade!");
    }

    @Override
    public void pokazInfo() {
        System.out.println("Cena:" + getPrice() + " nazwa:" + getName() + " opis:" + getDescribe());
    }
}