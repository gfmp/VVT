/*
 * Priklad: Rozhraní (interface)
 */


package Priklady;

/**
 *
 * @author Felix
 */
interface Porovnavani {
  // this (objekt volající metodu jeVetsiNez)
  // a jiny (objekt uvedený jako parametr
  // metody jeVetsiNez) musí být instancemi
  // stejné třídy implementující rozhraní
  // Porovnavani
  public int jeVetsiNez(Porovnavani jiny);
  // metoda jeVetsiNez vrací 1, 0, -1, jestliže
  // this je větší, roven, nebo menší než jiný
}

class ObdelnikVylepseny implements Porovnavani {
    public int sirka = 0;
    public int vyska = 0;

    // konstruktory
    public ObdelnikVylepseny(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    // metoda pro výpočet obsahu obdélníku
    public int getObsah() {
        return sirka * vyska;
    }

    // metoda, kterou je nutno implementovat z rozhraní Porovnavani
    public int jeVetsiNez(Porovnavani jiny) {
        ObdelnikVylepseny jinyObdelnik = (ObdelnikVylepseny)jiny;
        if (this.getObsah() < jinyObdelnik.getObsah())
          return -1;
        else if (this.getObsah() > jinyObdelnik.getObsah())
          return 1;
        else
          return 0;
    }


}


public class Rozhrani {
    public static void main(String[] args) {
    ObdelnikVylepseny o1 = new ObdelnikVylepseny(20, 10);
    ObdelnikVylepseny o2 = new ObdelnikVylepseny(10, 30);
    System.out.println(o1.jeVetsiNez(o2));
    }
}
