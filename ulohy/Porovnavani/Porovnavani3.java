/*
 * 3. Napište program, který požádá uživatele o zadání tří čísel a vypíše je v pořadí od nejmenšího k největšímu.
 */


package Ulohy.Porovnavani;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Porovnavani3 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Napis 3 cela cisla (oddelujte enterem)");
    int[] cisla = new int[3];
    cisla[0] = sc.nextInt();
    cisla[1] = sc.nextInt();
    
    if(cisla[1] > cisla[0]){
        int x = cisla[1];
        cisla[1] = cisla[0];
        cisla[0] = x;
    }
    
    cisla[2] = sc.nextInt();

    if(cisla[2] > cisla[0]){
        int x = cisla[2];
        cisla[2] = cisla[1];
        cisla[1] = cisla[0];
        cisla[0] = x;
    }else if(cisla[2] > cisla[1]){
        int x = cisla[2];
        cisla[2] = cisla[1];
        cisla[1] = x;
    }

        System.out.println("Nejmensi cislo:"+cisla[2]);
        System.out.println("Prostredni cislo:"+cisla[1]);
        System.out.println("Nejvetsi cislo:"+cisla[0]);

    }
}
