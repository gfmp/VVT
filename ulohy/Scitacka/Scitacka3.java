/*
 * 3.Napište program, který vyzve uživatele, aby zadal přirozené číslo.
 * Program potom vypíše všechna lichá čísla, která jsou menší než zadané číslo.
 */


package Ulohy.Scitacka;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Scitacka3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte prirozene cislo:");
        int a = sc.nextInt();

        if(a%2 == 0) a--;

        for(int i = 1; i<a; i+=2){
            System.out.println(i);
        }
    }

}
