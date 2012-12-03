/*
 * Maturitni otazka c.: 18
 * Nazev: Programování v jazyce Java – soubory
 * Zadani:
    * Terminálový vstup a výstup, formátovaný a neformátovaný souborový vstup a výstup
 */

package MaturitniOtazky;

import java.util.Scanner; // potrebujeme pro formatovany vstup

/**
 *
 * @author Felix
 */
public class MO18 {

    // neformatovany vystup
    static void neformatovanyVystup(){

        System.out.println("Neformatovany vystup");
        System.out.println("--------------------------------------------");

        // bez odradkovani
        System.out.print("Tohle je test");
        // s odradkovanim
        System.out.println("Tohle je test 2");

        int a = 1;
        int b = 5;
        char c = 'A';
        String s = "Nejaky text";

        System.out.println("Cislo a " + a);
        System.out.println("1 + 5 = " + a + b); // chyba
        System.out.println("1 + 5 = " + (a + b)); // spravne

        System.out.println("Cislo b " + b + " a znak c " + c + " ma ANSII hodnotu " + (int)c);
        System.out.println("Prvni veta\nDruha veta"); // \n = odradkovani (v html <br>)

        System.out.println("\"backslash\" : '\\'");
        System.out.println("'backslash' : '\\'");

        System.out.format("--------------------------------------------%n%n");
    }

    //formatovany vystup
    static void formatovanyVystup(){
        /*
         * metody:  System.out.format(predloha, promena);
         *          System.out.prinf - z C
         */

        System.out.println("Formatovany vystup");
        System.out.println("--------------------------------------------");
        
        int a = 123456;
        char c = 'A';
        // %n = odradkovani
        System.out.format("Prvni veta%nDruha veta%n");
        // d - cele cislo v 10 soustave
        System.out.format("a = %d%n", a);
        // zarovnani doprava
        System.out.format("a = %8d%n", a);
        // zarovnani doleva
        System.out.format("a = %-8d%n", a);
        // zobrazovani + a -
        System.out.format("a = %+8d%n", a);
        // zobrazovani nevyuzitych cisel jako 0
        System.out.format("a = %08d%n", a);
        // zobrazovani oddelovani radu
        // CZ = mezera, USA = ,(carka)
        System.out.format("a = %,8d%n", a);

        /* zobrazovani v jinych soustavach */
        // o - oktanova(8)
        System.out.format("a = %o%n", a);
        // x,X - hexadecimalni(16)
        System.out.format("a = %x%n", a);
        // slozeny zapis
        System.out.format("a = %08x%n", a);

        // c - znak
        System.out.format("c = %c%n", c);

        /* vypis realneho cisla */
        double d = 1234.5678;
        // f - realne cislo
        System.out.format("d = %f%n", d);
        // g - realne cislo - zalezi na velikosti
        System.out.format("d = %g%n", d); // klasicky
        double d2 = 123456;
        System.out.format("d2 = %g%n", d2); // pomoci e
        // e - vedeckotechnicka notace
        System.out.format("d = %e%n", d);
        // . - pocet desetinnych mist
        System.out.format("d = %.2f%n", d);
        // komplet
        System.out.format("d = %-,4.3fahoj%n", d);

        /* vypis retezce */
        String s = "Mami ja mam hlad!";
        // s - vypise retezec
        System.out.format("%s%n", s);
        // S - prevede na velka pismena
        System.out.format("%S%n", s);

        System.out.format("--------------------------------------------%n%n");
    }

    // formatovany vstup
    static void formatovanyVstup(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Formatovany vstup");
        System.out.println("--------------------------------------------");


        // zadani celeho cisla
        System.out.print("Vepiste cislo 1:");
        int a = sc.nextInt();

        // zadani realneho cisla
        System.out.print("Vepiste cislo 2:");
        double b = sc.nextDouble();

        // zadani znaku
        System.out.print("Vepiste znak:");
        char c = sc.next().charAt(0);

        // zadani retezce
        System.out.print("Vepiste slovo:");
        String s = sc.next();

        // zadani cele radky
        System.out.print("Vepiste vetu:");
        String line = sc.nextLine();

        /*
         * Poziraci (greedy) metody:
         * nextInt(), nextDouble(), next()
         * = konci prazdnym znakem
         * = odstranuji z pameti \n(konec radku)
         *
         * nextLine() konci \n .. 
         */

        System.out.format("--------------------------------------------%n%n");

    }

    public static void main(String[] args) {

        /*
         * tip: spoustet po jednom
         */


        //neformatovanyVystup();
        //formatovanyVystup();
        formatovanyVstup();
    }
}
