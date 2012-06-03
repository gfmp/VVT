/*
 * 7. Upravte kód předchozí ukázky tak, aby program sám do pole vložil lichá čísla
 * od 1 do 99 a poté je přehledně vypsal na obrazovku.
 */


package Ulohy.Pole;

/**
 *
 * @author Felix
 */
public class Pole7 {
    public static void main(String[] args) {
        int n = 100; // interval <1, n>
        // **********************************
        int a = n/2, x = 0;
        if(n%2 == 1) a++;

        int[] p = new int[a];
        for (int i=1; i<=n; i++)
        {
            if(i%2 == 1){
                p[x] = i;
                x++;
            }
        }

        System.out.println("V poli jsou cisla: ");
        for (int i=0; i<a; i++)
        {
            if(i%10 == 0 && i != 0) System.out.println();
            System.out.print(p[i] + ", ");
        }

    }
}
