/*
 * Priklad: Statické metody
 */


package Priklady;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
class Metody {

    static int max(int a, int b) {
        if (a > b)
            return(a);
        else
            return(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.print("Napis prvni cislo: ");
        x = sc.nextInt();
        System.out.print("Napis druhe cislo: ");
        y = sc.nextInt();
        z = max(x, y);
        System.out.print("Maximum z techto cisel je "+z);
    }
}
