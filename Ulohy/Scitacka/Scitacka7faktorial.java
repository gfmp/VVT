/*
 * 7. Napište program, který vypočítá faktoriál zadaného čísla.
 */


package Ulohy.Scitacka;

/**
 *
 * @author Felix
 */
public class Scitacka7faktorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Faktorial cisla "+n+" = "+faktorial(n));
    }

    public static int faktorial(int a){
        if(a == 1) return 1;
        return a*faktorial(a-1);
    }

}
