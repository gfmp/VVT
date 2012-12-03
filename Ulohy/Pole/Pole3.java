/*
 * 3. Upravte kód předchozí ukázky tak, aby program sám do pole vložil čísla
 * do 1 do 100 a poté vypsal pouze první, šedesátou a předposlední hodnotu v poli.
 */


package Ulohy.Pole;

/**
 *
 * @author Felix
 */
class Pole3 {
    public static void main(String[] args) {
        int n = 200; // interval <1, n>
        // **********************************
        int[] p = new int[n];
        for (int i=0; i<=(n-1); i++)
        {
            p[i] = (i+1);
        }

        System.out.println("Cislo na pozici 1: "+p[0]);
        System.out.println("Cislo na pozici 60: "+p[59]);
        System.out.println("Cislo na predposledni pozici: "+p[n-2]);
    }
}
