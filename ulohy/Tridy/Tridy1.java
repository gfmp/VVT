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
class Tridy1 {
    public static void main(String[] args) {
       
    Obdelnik o1 = new Obdelnik();
    o1.delka = 10;
    o1.sirka = 20;
    o1.info();

    Obdelnik o2 = new Obdelnik();
    o2.delka = 30;
    o2.sirka = 40;
    o2.info();

    Obdelnik o3 = new Obdelnik();
    o3.delka = 5;
    o3.sirka = 4;
    System.out.println("Obvod je "+o3.obvod());
  }
}

class Obdelnik {
  public int delka;
  public int sirka;

  public int obvod(){
    int pom;
    pom = 2*(delka+sirka);
    return pom;
  }

  public double uhlopricka(){
      return Math.sqrt(this.delka*this.delka + this.sirka*this.sirka);
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
    System.out.println("uhlopricka: "+uhlopricka());
  }
}
