/*
 * 10. Napište program, který přečte n čísel z klávesnice (n se zadá také z klávesnice).
 * Pro každý vstup čísla program vypíše:
 * Zadej 1. cislo:
 * Zadej 2. cislo:
 * Ze zadaných čísel určete, kolik jich leží v intervalu <50, 100>.
 */


package Ulohy.Scitacka;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Scitacka10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, pocetCisel, vIntervalu = 0;

        System.out.print("Zadejte pocet cisel:");
        pocetCisel = sc.nextInt();

        for(int i=1; i<=pocetCisel; i++){
            System.out.print("Zadej "+i+". cislo:");
            a = sc.nextInt();

            if(a == 0){
                System.out.println("Game over!");
                break;
            }

            if(a >= 50 && a <= 100) vIntervalu++;
        }
        System.out.println("Cisel v intervalu <50,100> bylo: "+vIntervalu);

    }
}
