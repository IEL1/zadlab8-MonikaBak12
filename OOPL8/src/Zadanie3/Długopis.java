package Zadanie3;
import Zadanie1.Product;

/**
 *
 * @author Monika
 */
public class Długopis extends Product{

    public Długopis(double price, String nazwa, String opis) {
        super(price, nazwa, opis);
    }
    @Override
    public void buy() {
        System.out.println("Kupiłam długopis!");
    }

    @Override
    public void pokazInfo() {
        System.out.println("Cena:" + getPrice() + " nazwa:" + getName() + " opis:" + getDescribe());
    }
}