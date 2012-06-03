/*
 * 2. Napište program, který požádá uživatele o zadání tří čísel a určí největší z nich.
 */


package Ulohy.Porovnavani;

import java.util.Scanner;

/**
 *
 * @author Felix
 */

public class Porovnavani2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Napis 3 cela cisla (oddelujte enterem)");
    int a,b,c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if(a > b && a > c){
        System.out.println("Nejvetsi cislo je a:" + a);
    } else if(b > a && b > c) {
        System.out.println("Nejvetsi cislo je b:" + b);
    } else if(c > a && c > b) {
        System.out.println("Nejvetsi cislo je c:" + c);
    } else {
        System.out.println("Je mozne ze jste zadali 2 nebo 3 stejna cisla");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    }
}
