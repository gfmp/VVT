/*
 * Maturitni otazka c.: 23
 * Nazev: Programování v jazyce Java – zapouzdření a dědičnost
 * Zadani:
    * Modifikátory deklarace třídy (public, abstract, finale), autorizovaný přístup k datům (metody setNěco() a getNěco()),
    * realizace dědičnosti, finální a abstraktní metody a třídy

 */

package MaturitniOtazky;

/**
 *
 * @author Felix
 */
abstract class Objekt{
    private String nazev;
    
    protected String getNazev(){
        return this.nazev;
    }

    protected void setNazev(String nazev){
        this.nazev = nazev;
    }

    abstract double getObsah();
    abstract double getObvod();
}


class Ctverec extends Objekt{

    private int a = 0;

    public Ctverec(){
        this.setNazev("Ctverec");
    }

    public Ctverec(int a){
        this.setNazev("Ctverec");
        this.a = a;
    }

    final double getObsah(){
        return this.a * this.a;
    }

    final double getObvod(){
        return this.a * 4;
    }
    
    public void info(){
        System.out.println("Nazev = " + this.getNazev());
        System.out.println("Obsah = " + this.getObsah());
        System.out.println("Obvod = " + this.getObvod());
    }
}

class Trojuhelnik extends Objekt{

    protected int a = 0, b = 0, c = 0, vA = 0;

    public Trojuhelnik(){
        this.setNazev("Trojuhelnik");
    }

    public Trojuhelnik(int a, int b, int c){
        this.setNazev("Trojuhelnik");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setVyska(int Va){
        this.vA = Va;
    }

    public int getVyska(){
        return this.vA;
    }

    public double getObsah(){
        return this.a * this.getVyska() / 2;
    }

    public double getObvod(){
        return this.a + this.b + this.c;
    }

    public void info(){
        System.out.println("Nazev = " + this.getNazev());
        System.out.println("Obsah = " + this.getObsah());
        System.out.println("Obvod = " + this.getObvod());
    }
}

class TrojuhelnikPravouhly extends Trojuhelnik{
    public TrojuhelnikPravouhly(){
        this.setNazev("TrojuhelnikPravouhly");
    }

    public TrojuhelnikPravouhly(int a, int b, int c){
        super(a,b,c);
        this.setNazev("TrojuhelnikPravouhly");
    }

    public final double getObsah(){
        return this.a * this.b / 2;
    }
}

public class MO23 {
    public static void main(String[] args) {
        Ctverec c1 = new Ctverec(5);
        c1.info();
        
        Trojuhelnik t1 = new Trojuhelnik(5,10,20);
        t1.setVyska(10);
        t1.info();

        TrojuhelnikPravouhly t2 = new TrojuhelnikPravouhly(5,2,20);
        t2.info();
    }
}
