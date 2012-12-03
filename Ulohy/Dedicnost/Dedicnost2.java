/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Ulohy.Dedicnost;

interface Porovnavani {
    public int jeVetsiNez(Porovnavani jiny);
}

abstract class Utvar implements Porovnavani{

    abstract int getObsah();

    public int jeVetsiNez(Porovnavani jiny){
        Utvar u = (Utvar) jiny;
        if(this.getObsah() > u.getObsah()){
            return 1;
        }else{
            return 0;
        }
    }
}

class Obdelnik extends Utvar {
  public int sirka = 0;
  public int vyska = 0;

  // konstruktory
  public Obdelnik(int sirka, int vyska) {
    this.sirka = sirka;
    this.vyska = vyska;
  }

  // metoda pro výpočet obsahu obdélníku
  public int getObsah() {
    return sirka * vyska;
  }

  // metoda, kterou je nutno implementovat z rozhraní Porovnavani
}


class Usecka extends Utvar {
  public int delka = 0;

  // konstruktory
  public Usecka(int delka) {
    this.delka = delka;
  }

  // metoda pro výpočet obsahu obdélníku
  public int getDelka(){
      return this.delka;
  }

  public int getObsah(){
      return 0;
  }

}

public class Dedicnost2 {
    public static void main(String[] args) {
        Obdelnik o1 = new Obdelnik(20, 10);
        Obdelnik o2 = new Obdelnik(10, 30);

        Usecka u1 = new Usecka(10);
        Usecka u2 = new Usecka(20);
        System.out.println(o1.jeVetsiNez(u1));
    }
}
