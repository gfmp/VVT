/*
 * Priklad: Nová syntaxe cyklu for a metody s proměnným počtem parametrů
 */


package Priklady;

/**
 *
 * @author Felix
 */

class NovaSyntaxePole2{
    public static int max(int... seznam) {
        int m = Integer.MIN_VALUE;
        for (int cislo: seznam) {
            if (cislo > m)
                m = cislo;
        }
        return(m);
    }

    public static void main(String[] args) {
        int x = max(7, 3, 2, 5, 9, 4, 5, 1);
        System.out.println("Maximum z cisel je " + x);
    }
}

