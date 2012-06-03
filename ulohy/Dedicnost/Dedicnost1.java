/*
 * 1. Doplňte do tříd Utvar, Bod a Kruznice jednoparametrické konstruktory,
 * které budou umožňovat určit barvu utvaru přímo při jeho vytvoření.
 * 2. Doplňte do tříd Bod a Kružnice víceparametrické konstruktory,
 * které budou umožňovat určit barvu a souřadnice útvaru a v případě kružnice i poloměr.
 * 3. Vytvořte další třídu Ctverec, která bude potomkem třídy Utvar a bude fungovat podobně, jako třídy Bod a Kruznice.
 */


package Ulohy.dedicnost;

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

// Bod
class Bod extends Utvar {
    private int x, y;

    public Bod() {
        x = 0;
        y = 0;
    }
    public Bod(String barva){
        this.setBarva(barva);
    }

    public Bod(int x, int y, String barva){
        this.setBarva(barva);
        this.x = x;
        this.y = y;
    }

    public double obsah() {
        return 0;
    }

    public void setBarva(String barva){
        this.barva = "bod nema barvu";
    }

    public void info() {
        System.out.println("Bod [" + x + "," + y + "]");
    }
}

// Kruznice
class Kruznice extends Utvar {
    private int x, y, r;

    public Kruznice() {
        x = 0;
        y = 0;
        r = 1;
    }

    public Kruznice(String barva){
        this.setBarva(barva);
    }

    public Kruznice(int x, int y, int r, String barva){
        this.setBarva(barva);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double obsah() {
        return Math.PI*r*r;
    }

    public void info() {
        System.out.println("Kruznice [" + x + "," + y + "], r=" + r);
    }
}

// Ctverec
class Ctverec extends Utvar {
    private int x,y, a;

    public Ctverec() {
        a = 0;
    }

    public Ctverec(String barva){
        this.setBarva(barva);
    }

    public Ctverec(int x, int y, int a, String barva){
        this.setBarva(barva);
        this.x = x;
        this.y = y;
        this.a = a;
    }

    public double obsah() {
        return a*a;
    }

    public void info() {
        System.out.println("Ctverec [" + x + "," + y + "], a=" + a);
    }
}

class Dedicnost {
    public static void main(String[] args) {

    Bod A = new Bod(5,6,"Cerna");
    A.info();
    System.out.println("Obsah: " + A.obsah());
    System.out.println("Barva: " + A.getBarva());

    System.out.println("---------------------");

    Kruznice k = new Kruznice(10,10,99,"Hneda");
    k.info();
    System.out.println("Obsah: " + k.obsah());
    System.out.println("Barva: " + k.getBarva());

    System.out.println("---------------------");

    Ctverec c = new Ctverec(1,5,6,"Modry");
    c.info();
    System.out.println("Obsah: " + c.obsah());
    System.out.println("Barva: " + c.getBarva());

    }
}




