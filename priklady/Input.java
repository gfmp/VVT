/*
 * Priklad: Ukázka uživatelského vstupu
 */


package Priklady;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
class Input {
    public static void main(String[] args) {
        Scanner cti = new Scanner(System.in);
        System.out.println("Napis cislo a stiskni ENTER! ");
        int a = cti.nextInt();  // nacte cele cislo
        System.out.println("Napsal jsi cislo: ");
        System.out.println(a);
    }
}
