/*
 * Priklad: Ukázka cyklu while - program sčítá čísla dokud nezadáme 0
 */


package Priklady;

/**
 *
 * @author Felix
 */
import java.util.Scanner;

class Scitacka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Napis cislo: ");
        int s = 0;
        int i = sc.nextInt();
        while (i!=0)
        {
            s = s + i;
            System.out.print("Mezisoucet je: ");
            System.out.println(s);
            System.out.print("Napis dalsi cislo: ");
            i = sc.nextInt();
        }

    }
}
