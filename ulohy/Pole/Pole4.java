/*
 * 4. Upravte kód předchozího cvičení tak, aby program celé pole vynuloval (vložil do pole samé nuly
 * a poté pole přehledně vypsal na obrazovku.
 */


package Ulohy.Pole;

/**
 *
 * @author Felix
 */
class Pole4 {
    public static void main(String[] args) {
        int n = 100; // interval <1, n>
        // **********************************
        int[] p = new int[n];
        for (int i=0; i<=(n-1); i++)
        {
            p[i] = 0;
        }
        System.out.println("V poli jsou cisla: ");
        for (int i=0; i<=(n-1); i++)
        {
            if(i%10 == 0 && i != 0) System.out.println();
            System.out.print(p[i] + ", ");
        }
    }
}
