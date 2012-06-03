/*
 * Priklad: Konstruktory
 */


package Priklady;

/**
 *
 * @author Felix
 */
class Konstruktory {
  public static void main(String[] args) {
    Konstruktory_Obdelnik.pozdrav();
    Konstruktory_Obdelnik o1 = new Konstruktory_Obdelnik(10, 20);
    o1.info();
    Konstruktory_Obdelnik o2 = new Konstruktory_Obdelnik(30);
    o2.info();
  }
}

class Konstruktory_Obdelnik {
  public int delka;
  public int sirka;

  public Konstruktory_Obdelnik(int parDelka) {
    delka = parDelka;
    sirka = parDelka;
  }

  public Konstruktory_Obdelnik(int parDelka, int parSirka) {
    delka = parDelka;
    sirka = parSirka;
  }

  public int obvod() {
    int pom;
    pom = 2*(delka+sirka);
    return pom;
  }

  public int obsah() {
    return delka*sirka;
  }

  public static void pozdrav() {
      System.out.println("Ahoj");
  }

  public void info() {
    System.out.println("Obdelnik");
    System.out.println("---------");
    System.out.println("delka: "+delka);
    System.out.println("sirka: "+sirka);
    System.out.println("obvod: "+obvod());
    System.out.println("obsah: "+obsah());
  }
}
