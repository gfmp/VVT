/*
 * 5. Upravte kód předchozího cvičení tak, aby program sám do pole vložil čísla
 * do 1 do 100 a poté umožnil uživateli změnit první, padesáté a poslední číslo.
 * Na závěr program vypíše přehledně všechna čísla v poli na obrazovku.
 */


package Ulohy.Pole;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Pole5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100; // interval <1, n>
        // **********************************
        int[] p = new int[n];
        for (int i=0; i<=(n-1); i++)
        {
            p[i] = (i+1);
        }

        System.out.print("Vlozte cislo na pozici 1:");
        p[0] = sc.nextInt();
        System.out.print("Vlozte cislo na pozici 60:");
        p[59] = sc.nextInt();
        System.out.print("Vlozte cislo na predposledni pozici:");
        p[n-2] = sc.nextInt();

        System.out.println("V poli jsou cisla: ");
        for (int i=0; i<=(n-1); i++)
        {
            if(i%10 == 0 && i != 0) System.out.println();
            System.out.print(p[i] + ", ");
        }
    }
}
