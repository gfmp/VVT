/*
 * 1. Metodu min(), která vrátí menší ze dvou čísel, která jsou uvedena jako parametry metody.
 * 2. Metodu soucet(), která vrátí součet dvou čísel, která jsou uvedena jako parametry metody.
 * 3. Metodu prumer(), která vrátí aritmetický průměr ze dvou čísel, která jsou uvedena jako parametry funkce.
   * (Pozor, návratová hodnota metody může být desetinné číslo!)
 * 4. Metodu obsahKruhu(), která pomocí hodnoty parametru r (poloměru kruhu) vypočítá obsah kruhu.
   * (Pozor, hodnota parametru r může být desetinné číslo!)
 * 5. Metodu faktorial(), která vrátí faktoriál přirozeného čísla, které je uvedeno jako parametr metody.
 * 6. Metodu mocnina(), která vrátí n-tou mocninu čísla x. Přitom n je první parametr metody
   * (přirozené číslo) a x je druhý parametr metody (může to být i desetinné číslo).
 */


package Ulohy.Metody;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
class Metody {

    // vraci maximum z cisel a, b
    static int max(int a, int b) {
        if (a > b){ return(a);
        } else { return(b); }
    }

    // vraci minumum z cisel a, b
    static int min(int a, int b) {
        if (a < b){ return(a);
        } else { return(b); }
    }

    // vraci soucet cisel a, b
    static int soucet(int a, int b) {
        if (a < b){ return(a);
        } else { return(b); }
    }

    // vraci prumer cisel a, b
    static double prumer(int a, int b) {
        return (a+b)/2.0;
    }

    // vraci obsah kruhu(r)
    static double obsahKruhu(double r){
        return Math.PI*r*r;
    }

    // vraci faktorial(f)
    static int faktorial(int f){
        if(f == 1) return 1;
        return f*faktorial(f-1);
    }

    // vraci n-tou mocninu cisla x
    static double mocnina(int n,double x){
        if(n == 0) return 1;
        return x*mocnina(n-1,x);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        double z;

        /*
        System.out.print("Napis prvni cislo: ");
        x = sc.nextInt();
        System.out.print("Napis druhe cislo: ");
        y = sc.nextInt();
        */
        
        //z = max(x,y); 
        //z = max(x,y);
        //z = soucet(x,y);
        //z = prumer(x,y);
        //z = obsahKruhu(5);
        //z = faktorial(5);
        z = mocnina(5,5);

        System.out.println("Vysledek = "+z);
    }
}
