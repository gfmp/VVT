/*
 * 9. Napište program, který čte celá čísla tak dlouho, dokud nezadáme číslo 0 (nula).
 * Na závěr program vypíše, kolik zadaných čísel bylo z intervalu <10, 20>.
 */


package Ulohy.Scitacka;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Scitacka9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, vIntervalu = 0;

        while(true){
            System.out.print("Zadejte cislo:");
            a = sc.nextInt();

            if(a == 0){
                System.out.println("Game over!");
                break;
            }

            if(a >= 10 && a <= 20) vIntervalu++;
        }
        System.out.println("Cisel v intervalu <10,20> bylo: "+vIntervalu);

    }
}
