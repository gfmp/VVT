/*
 * 2. Upravte kód předchozí ukázky tak, aby program nalezl největší hodnotu v poli.
 */


package Ulohy.NovaSyntaxe;

/**
 *
 * @author Felix
 */
class NovaSyntaxePole2{
    public static void main(String[] args) {
        int[] pole = new int[] {2, 4, 6, 8, 10};
        int max = Integer.MIN_VALUE;
        for (int x: pole)
        {
            if(max<x) max = x;
        }
        System.out.println("Nejvetsi cislo je " + max);
    }
}
