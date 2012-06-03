/*
 * 2. Upravte kód předchozí ukázky tak, aby program sám do pole vložil čísla
 * do 1 do 100 a poté je přehledně výpsal na obrazovku.
 */


package Ulohy.Pole;

/**
 *
 * @author Felix
 */
class Pole2 {
    public static void main(String[] args) {
        int n = 20; // interval <1, n>
        // **********************************
        int[] p = new int[n];
        for (int i=0; i<=(n-1); i++)
        {
            p[i] = (i+1);
        }
        System.out.println("V poli jsou cisla: ");
        for (int i=0; i<=(n-1); i++)
        {
            if(i%10 == 0 && i != 0) System.out.println();
            System.out.print(p[i]+", ");
        }
    }
}
