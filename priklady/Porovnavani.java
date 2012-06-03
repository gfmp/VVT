/*
 * Priklad: Ukázka porovnávání dvou čísel
 */


package Priklady;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
class Porovnani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis cele cislo a: ");
        int a;
        a = sc.nextInt();
        System.out.println("Napis cele cislo b: ");
        int b;
        b = sc.nextInt();
        if (a > b)
            System.out.println("Cislo a je vetsi nez b");
        else
    	    System.out.println("Cislo a je mensi nebo rovno cislu b");
    }
}
