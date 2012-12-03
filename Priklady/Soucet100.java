/*
 * Priklad: Ukázka cyklu for - součet čísel od 1 do 100
 */


package Priklady;

/**
 *
 * @author Felix
 */
class Soucet100 {
    public static void main(String[] args) {
        int i, s=0;
        for (i=1; i <= 100; i++)
        {
            s = s + i;
        }
        System.out.println(s);
    }
}

