/*
 * Maturitni otazka c.: 22
 * Nazev: Programování v jazyce Java – třídy a objekty
 * Zadani:
    * Základní pojmy objektového programování, třída, objekt, instance, deklarace třídy, vytvoření objektu,
    * konstruktor, implicitní konstruktor, přetížení konstruktorů, využití this pro přístup k proměnným,
    * metody, přetížení metod, proměnné třídy (static), statické metody

 */

package MaturitniOtazky;

/**
 *
 * @author Felix
 */
class Zakaznik {
    static public int pocetZakazniku = 0;  // promenna tridy
    public int cisloZakaznika = 0;
    public int utratil;                    // promenna instance
    public String jmeno;
    public String mena = "Kc";

    // implicitni konstruktor
    public Zakaznik() {
        Zakaznik.pocetZakazniku++;
        this.cisloZakaznika = Zakaznik.pocetZakazniku;
        this.utratil = 0;
        this.jmeno = "Noname";
    }

    public Zakaznik(String jmeno){
        Zakaznik.pocetZakazniku++;
        this.cisloZakaznika = Zakaznik.pocetZakazniku;
        this.jmeno = jmeno;
    }

    public void platil(int cena) {
        this.utratil += cena;
    }

    public void platil(int cena, String mena){
        this.utratil += cena;
        this.mena = mena;
    }

    public static int pocetZakazniku(){
        return Zakaznik.pocetZakazniku;
    }

    public void info(){
        System.out.println();
        System.out.println("Zakaznik c." + this.cisloZakaznika);
        // musi byt pres promenou instance, jinak to bude delat neplechu
        //System.out.println("(CHYBA) Zakaznik c." + Zakaznik.pocetZakazniku);
        System.out.println("Jmeno:" + this.jmeno);
        System.out.println("Utratil:" + this.utratil + "(" + this.mena + ")");
    }

}


public class MO22 {
    public static void main(String[] args) {
        System.out.println("Pocet zakazniku: " + Zakaznik.pocetZakazniku);

        //vytvoreni instance
        Zakaznik zak1 = new Zakaznik("Milan");
        zak1.platil(15, "EU");
        zak1.info();

        //vytvoreni instance
        Zakaznik zak2 = new Zakaznik();
        zak2.platil(20);
        zak2.info();

        // dalsi metody..
        zak1.platil(30);
        zak1.info();
        
        System.out.println();
        System.out.println("Pocet zakazniku: " + Zakaznik.pocetZakazniku());
        System.out.println("Utratili: " + zak1.utratil + " + " + zak2.utratil);
    }
}
