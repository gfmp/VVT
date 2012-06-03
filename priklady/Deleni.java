/*
 * Priklad: Ukázka celočíselného dělení
 */

package Priklady;

/**
 *
 * @author Felix
 */
import java.util.Scanner;

class Deleni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Napis cele cislo a: ");
        int a;
        a = sc.nextInt();
        System.out.print("Napis cele cislo b: ");
        int b;
        b = sc.nextInt();
        System.out.print("Podil je: ");
        System.out.println(a/b); // celociselne deleni
        System.out.print("Zbytek je: ");
        System.out.println(a%b); // zbytek pri celociselnem deleni
    }
}
