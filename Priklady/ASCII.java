/*
 * Priklad: Výpis znaků z dolní poloviny ASCII tabulky
 */


package Priklady;

/**
 *
 * @author Felix
 */
class ASCII {
    public static void main(String[] args) {
        int i;
        for (i=32; i <= 127; i++)
        {
            System.out.println((char)i);
        }
    }
}
