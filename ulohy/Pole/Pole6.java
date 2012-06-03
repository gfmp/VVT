/*
 * 6. Upravte kód předchozího cvičení tak, aby program sám do pole vložil čísla
 * do 1 do 100 a poté vyzval uživatele, aby si sám zvolil na které pozici v poli
 * chce změnit hodnotu (uživatel zadá pozici v poli číselně v rozsahu 1 až 100).
 * Poté program vyzve uživatele, aby zadal novou hodnotu na tuto pozici.
 * Na závěr program vypíše přehledně všechna čísla v poli na obrazovku.
 */


package Ulohy.Pole;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Pole6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100; // interval <1, n>
        // **********************************
        int[] p = new int[n];
        for (int i=0; i<=(n-1); i++)
        {
            p[i] = (i+1);
        }

        System.out.print("Pozice v intervalu <1,"+n+">:");
        int pozice = sc.nextInt();
        while(pozice < 1 || pozice > n){
            System.out.print("Pozice neni v intervalu <1,"+n+">, zadejte ji prosim znovu:");
            pozice = sc.nextInt();
        }
        
        System.out.print("Vyplnte cislo:");
        p[pozice-1] = sc.nextInt();
 
        System.out.println("V poli jsou cisla: ");
        for (int i=0; i<=(n-1); i++)
        {
            if(i%10 == 0 && i != 0) System.out.println();
            System.out.print(p[i] + ", ");
        }
    }
}
