/*
 * Priklad: Třídy a objekty
 */


package Priklady;

/**
 *
 * @author Felix
 */
class Tridy {
  public static void main(String[] args) {
    Obdelnik o1 = new Obdelnik();
    o1.delka = 10;
    o1.sirka = 20;
    o1.info();
  }
}

class Obdelnik {
  public int delka;
  public int sirka;

  public int obvod() {
    int pom;
    pom = 2*(delka+sirka);
    return pom;
  }

  public int obsah() {
    return delka*sirka;
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
