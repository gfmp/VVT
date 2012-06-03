/*
 * Maturitni otazka c.: 20
 * Nazev: Programování v jazyce Java – metody 
 * Zadani:
    * Deklarace metody, metoda bez parametrů, metoda bez návratového typu (procedura),
    * metoda s více parametry různých typů, přetížené metody,
    * proměnné z pohledu přístupnosti z metod (lokální a nelokální proměnné, zastínění nelokálních proměnnách lokálními)
 */

package MaturitniOtazky;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class MO20 {

    /*
     * kazda metoda musi mit:
     * 1) nastavena prava(viditelnost)
     * public, static, private, protected, abstract, final, none(nic)
     * 2) navratovy tip
     * int, float, string, etc.. nebo void = nevraci nic
     */


    /*
     * Deklarace metody
     */
    static int max(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }

    /*
     * Metoda bez parametru
     */
    static int secti() {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();
        return (a + b);
    }

    /*
     * Metoda bez navratoveho typu - procedura
     */
    static void tiskPenez(int koruny) {
        System.out.println("Cena: " + koruny + " Kc");
    }
    // bez parametru
    static void pozdrav(){
        System.out.println("Ahoj!");
    }

    /*
     * Metoda s vice parametry ruznych typu
     */
    static double secti(int a, double b) {
        return a + b;
    }

    static int secti(int a, int b) {  // přetížená metoda secti()
       return a + b;
    }

    /*
     * Rekurzivni metody
     */
    static long faktorial(long n) {
        if (n > 1)
          return n * faktorial(n - 1);
        else
          return 1;
    }

    /*
     * Konverze skutecnych parametru a navratove hodnoty metody
     */
    static int konv1(double d) {
        return (int) d; // pretypovani double -> integer
    }
    static double konv2(int d){
        return d; // double obsahuje int ..
    }

    /*
     * Nelokalni promenne - "globalni" promenne
     */
    static int i = 5;

    static void tiskni(){
        System.out.println("Cislo i = "+i);
    }

    /*
     * Promenne metod - lokalni promenne
     */
    static void tiskni2(){
        int i = 10;
        System.out.println("Cislo i = "+i);
    }

    /* 
     * Zastineni nelokalnich promennych lokalnimi
     */
    static void tiskni3(){
        int i = 6;
        System.out.println(i); // 6
        System.out.println(MO20.i); // 5
    }

    public static void main(String[] args) {
        //System.out.println("Vetsi je " + max(10,15));
        //System.out.println("Vysledek = " + secti());
        //tiskPenez(50);
        //System.out.println(secti(1, 3.14));
        //System.out.println(secti(2, 5));
        //System.out.println("Faktorial 5 = " + faktorial(5));
        //System.out.println("Konverze double -> int: " + konv1( (double)5.5) );
        //tiskni();
        //tiskni2();
        //tiskni3();
    }
}
