/*
 * 1. Metoda pocetAcek(), která vrátí počet znaků "a" v textovém řetězci.
 * 2. Metoda prvniVelke(), která vrátí textový řetězec, který bude kopií původního
 * textového řetězce, ale první písmeno bude velké.
 */


package Ulohy.Metody;

import java.util.Scanner;
/**
 *
 * @author Felix
 */
public class MetodyString {

    // vraci hodnotu vyskytu pismene 'a' v retezci str
    static int pocetAcek(String str){
        int a = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a') a++; // porovnani retezcu
            //if((int)str.charAt(i) == (int)'a') a++; // porovnani cisel
        }
        return a;
    }

    // vraci retezec str s prvnim velkym pismenem
    static String prvniVelke(String str){
       String first = String.valueOf(str.toUpperCase().charAt(0)); // prvni velke
       return first+str.toLowerCase().substring(1); // spoji prvni + zbytek
    }

    // pocet pismen(p) v retezci(s)
    static int pocetPismen(char p, String s){
        int a = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == p) a++; // porovnani retezcu
            //if((int)str.charAt(i) == (int)p) a++; // porovnani cisel
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte retezec: ");
        String s = sc.nextLine();

        System.out.println("pocetAcek: " + pocetAcek(s));
        //System.out.println("pocetPismen: " + pocetPismen('a',s));
        System.out.println("prvniVelke: " + prvniVelke(s));

    }
}
