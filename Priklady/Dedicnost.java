/*
 * Priklad: Abstraktní třídy a metody
 */


package Priklady;

/**
 *
 * @author Felix
 */

// Predloha utvar
abstract class Utvar {
  protected String barva;

  public Utvar() {}

  public void setBarva(String barva) {
        this.barva = barva;
  }

  public String getBarva() {
        return barva;
  }
  
  abstract public double obsah();
}

class Bod extends Utvar {
  private int x, y;
  public Bod() {
    x = 0;
    y = 0;
  }
  public double obsah() {
    return 0;
  }
  public void info() {
    System.out.println("Bod [" + x + "," + y + "]");
  }
}

class Kruznice extends Utvar {
  private int x, y, r;
  public Kruznice() {
    x = 0;
    y = 0;
    r = 1;
  }
  public double obsah() {
    return Math.PI*r*r;
  }
  public void info() {
    System.out.println("Kruznice [" + x + "," + y + "], r=" + r);
  }
}


class Dedicnost {
    public static void main(String[] args) {
    Bod A = new Bod();
    A.info();
    System.out.println("Obsah: " + A.obsah());
    Kruznice k = new Kruznice();
    k.info();
    System.out.println("Obsah: " + k.obsah());
    }
}





