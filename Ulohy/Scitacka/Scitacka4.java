/*
 * 4. Napište program, který vyzve uživatele, aby zadal dvě celá čísla. Program 
 * potom vypíše všechna čísla, která leží mezi těmito dvěma zadanými čísly.
 * (Pozor, program musí fungovat i v případě, že první zadané číslo je větší než druhé.)
 */


package Ulohy.Scitacka;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Scitacka4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte cislo a:");
        int a = sc.nextInt();
        System.out.print("Zadejte cislo b:");
        int b = sc.nextInt();

        int s = a, t = b;
        if(a > b){ s = b; t = a; }

        for(int i = (s+1); i<t; i++){
            System.out.println(i);
        }
    }
}
