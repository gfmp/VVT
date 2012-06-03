/*
 * 1. Upravte kód předchozí ukázky tak, aby program vypsal všechny hodnoty v poli.
 */


package Ulohy.NovaSyntaxe;

/**
 *
 * @author Felix
 */
class NovaSyntaxePole1 {
    public static void main(String[] args) {
        int[] pole = new int[] {2, 4, 6, 8, 10};
        int soucet = 0;
        for (int x: pole)
        {
            soucet = soucet + x;
            System.out.println(x);
        }
        System.out.println("Soucet cisel v poli je: " + soucet);
    }
}
