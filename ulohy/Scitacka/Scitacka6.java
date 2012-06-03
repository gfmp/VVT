/*
 * 6. Určete součet všech sudých čísel ležících mezi čísly 1000 a 2000.
 */


package Ulohy.Scitacka;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Scitacka6 {
    public static void main(String[] args) {
        int soucet = 0;
        for(int i = 1000; i<2000; i+=2){
            soucet+= i;
        }

        System.out.println("Soucet je: " + soucet);

    }
}
