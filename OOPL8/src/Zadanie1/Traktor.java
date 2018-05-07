package Zadanie1;

/**
 *
 * @author Monika
 */
public class Traktor extends Product {
    public Traktor(double price, String nazwa, String opis) {
    super(price, nazwa, opis);
    
    }
    public void buy(){
        System.out.println("TRAKTOR");
    }
    public void pokazInfo(){
        System.out.println("Cena:"+getPrice() + "Nazwa" + getName() + "opis" + getDescribe());
    }
    
}
