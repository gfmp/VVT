/*
 * 1. Upravte kód předchozí ukázky tak, aby bylo možné do pole vložit 8 čísel
 * a poté byl proveden jejich přehledný výpis na obrazovku.
 */


package Ulohy.Pole;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
class Pole1 {
    public static void main(String[] args) {
        int[] p = new int[8];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<p.length; i++)
        {
            System.out.print("Napis cislo: ");
            p[i] = sc.nextInt();
        }
        System.out.println("V poli jsou cisla: ");
        for (int i=0; i<p.length; i++)
        {
            System.out.print(p[i]+", ");
        }
    }
}
