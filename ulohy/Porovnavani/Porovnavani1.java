/*
 * Napište program, který požádá uživatele o zadání jednoho celého čísla.
 * Poté program vypíše, jestli dané číslo:
 * 1. je kladné
 * 2. leží v intervalu (-10, 10)
 * 3. je sudé
 * 4. je dělitené 3 nebo 5
*/


package Ulohy.Porovnavani;

import java.util.Scanner;

/**
 *
 * @author Felix
 */

class Porovnani1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Napis cele cislo a: ");
        int a;
        a = sc.nextInt();
        if (a > 0)
            System.out.println("Cislo a je kladne");
        if (a > -10 && a < 10)
            System.out.println("Cislo a lezi v intervalu (-10,10)");
        if (a%2 == 0)
            System.out.println("Cislo a je sude");
        if (a%3 == 0){
            System.out.println("Cislo a je delitelne 3");
        } else if(a%5 == 0) {
            System.out.println("Cislo a je delitelne 5");
        } else {
            System.out.println("Cislo a neni delitelne 3 ani 5");
        }
    }
}
