/*
 * Priklad: Nová syntaxe cyklu for
 */


package Priklady;

/**
 *
 * @author Felix
 */
public class NovaSyntaxePole {
    public static void main(String[] args) {
        int[] pole = new int[] {2, 4, 6, 8, 10};
        int soucet = 0;
        for (int x: pole)
        {
            soucet = soucet + x;
        }
        System.out.println("Soucet cisel v poli je: " + soucet);
    }
}
