/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Ulohy.Pole;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Pole8bubble {
public static void main(String[] args) {
        int n = 5; // interval <1, n>
        // **********************************

        //scanner
        Scanner sc = new Scanner(System.in);

        //inicializace poli
        int[] p = new int[n];
        int[] temp = new int[n];

        //naplneni pole uziv. cisly
        for(int i=0; i<p.length; i++){
            System.out.print("Zadejte "+(i+1)+". cislo:");
            p[i] = sc.nextInt();
        }

        //serazeni
        int max = Integer.MIN_VALUE, key = 0;

        // Bubble sort
        while (true) {
            boolean finished = true;  // predpokladam, ze se uz nic nemenilo
            for (int i=0; i<p.length-1; i++) {
                if (p[i] > p[i+1]) {
                    // switch those two
                    int tmpi = p[i];
                    p[i] = p[i+1];
                    p[i+1] = tmpi;
                    finished = false;
                }
            }
            if (finished) break;
        }
        //vypsani cisel - od nejmensiho
        System.out.println("Od nejvetsiho:");
        for(int i=0; i<p.length; i++){
            System.out.print(p[i] + ", ");
        }
    }
}
