/*
 * Ve třídě Tridy vytvořte další instance objektu Obdelnik.
 * Ve třídě Tridy vypište pouze obvod obdelníku, aniž byste jakkoli měnili kód třídy Obdelnik.
 * Ve třídě Obdelnik vytvořte metodu uhlopricka(), která bude počítat délku úhlopříčky obdélníku
 * (nezapoměňte, že délka úhlopříčky nemusí být celé číslo!).
 */


package Ulohy.Tridy;

/**
 *
 * @author Felix
 */
class Tridy {
  public static void main(String[] args) {
 
    Kruznice k1 = new Kruznice();
    k1.polomer = 5;
    k1.info();
  }
}

class Kruznice {
  public double polomer;

  public double obvod() {
    return Math.PI * 2 * this.polomer;
  }

  public double obsah() {
    return Math.PI * this.polomer * this.polomer;
  }

  public void info() {
    System.out.println("Kruznice");
    System.out.println("---------");
    System.out.println("polomer: "+this.polomer);
    System.out.println("obvod: "+obvod());
    System.out.println("obsah: "+obsah());
  }
}
