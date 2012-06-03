/*
 * 5. Napište program, který vyzve uživatele, aby zadal dva znaky.
 * Program potom vypíše všechny znaky z ASCII tabulky, které leží mezi těmito dvěma zadanými znaky.
 */


package Ulohy.Scitacka;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Scitacka5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte znak a:");
        int a = sc.nextLine().charAt(0);
        System.out.print("Zadejte znak b:");
        int b = sc.nextLine().charAt(0);

        int s = a, t = b;
        if(a > b){ s = b; t = a; }

        for(int i = (s+1); i<t; i++){
            System.out.println((char)i);
        } 
    }
}
