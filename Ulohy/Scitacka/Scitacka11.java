/*
 * 11. Napište program, který přečte n čísel z klávesnice (n se zadá také z klávesnice) a určí největší z nich. 
 */


package Ulohy.Scitacka;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Scitacka11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pole;
        int n,a,max = 0;

        System.out.print("Zadejte pocet cisel:");
        n = sc.nextInt();

        pole = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Zadejte " +(i+1)+ ". cislo:");
            a = sc.nextInt();

            if(a>max) max = a;
        }

        System.out.println("Nejvetsi cislo bylo: " + max);

    }

}
