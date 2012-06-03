/*
 * 8. Napište program, který čte celá čísla tak dlouho, dokud nezadáme číslo 0 (nula).
 * U každého zadaného čísla program vypíše, jestli je sudé, nebo liché.
 */


package Ulohy.Scitacka;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Scitacka8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        while(true){
            System.out.print("Zadejte cislo:");
            a = sc.nextInt();

            if(a == 0){
                System.out.println("Game over!");
                break;
            }

            if(a%2 == 0){
                System.out.println("Cislo "+a+" je sude");
            }else{
                System.out.println("Cislo "+a+" je je liche");
            }
        }

    }
}
