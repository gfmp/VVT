/*
 * Maturitni otazka c.: 19
 * Nazev: Programování v jazyce Java – řídící struktury
 * Zadani:
    * Podmíněný příkaz if, příkaz switch, cykly  while, do-while a for, příkazy break, continue a repeat
 */

package MaturitniOtazky;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class MO19 {

    /* 
     * Priklad if,else,else if
     */
    public static void prikladIf(){
        int a = 10, b = 5, c = -50;

        // { a } se muze u 1 prikazu vynechat
        if(a > b) System.out.println("A je vetsi nez b");

        // slozene podminky
        if(a > b){
            // 2 prikazy, { a } musi byt pouzity
            System.out.println("A je vetsi nez b");
            System.out.println("Je to tak");
        } else {
            System.out.println("B je vetsi nez a");
        }

        // priklad
        int d;
        if (a == 5)
            d = 5;
        else
            d= 8;

        // vice prvku
        if(b > a){
            System.out.println("B je vetsi nez a");
        }else if(a > c){
            System.out.println("B je vetsi nez c");
        }else{
            System.out.println("B neni vetsi nez a ani c");
        }

        // ternarni operator
        // booleansky-vyraz ? vyraz1 : vyraz2
        String x = ((c > a) ? "ano" : "ne");
        System.out.println("Plati vyraz c > a ? Odpoved: "+x);

    }


    /*
     * Priklad while, continue, break
     */
    public static void prikladWhile(){

        int x = 0;
        while(x < 10){
            System.out.println(++x);
        }

        // nekonecny while
        int y = 0;
        Scanner sc = new Scanner(System.in);

        // 0 ukonci
        while(true){
            System.out.print("Zadejte cisslo: ");
            y = sc.nextInt();
            System.out.println("Vase cislo "+y);

            if(y > 0)
                continue;
            else
                break;
        }

    }

    /*
     * Priklad while-do
     */
    public static void prikladWhileDo(){
        
        int x = 0;

        do{
            System.out.println(++x);
        } while( x < 10);

    }

    /*
     * Priklad for
     */
    public static void prikladFor(){

        // klasicky zpusob
        for(int i=0;i<100;i++){
            System.out.println(i);
        }

        // novy zpusob, neco jako foreach v php
        int[] pole = new int[] {1,2,3,4,5,6,7};
        for(int x : pole){
            System.out.println(x);
        }

    }

    /*
     * Priklad switch, case, break, default
     */
    public static void prikladSwitch(){

        System.out.print("Zadejte cislo: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch(x){
            case 5:
                System.out.println("Vase cislo je 5");
                break; // ukoncuje prislusnou vetev
            case 4:
                System.out.println("Vase cislo je 4");
               break;
            case 3:
                System.out.println("Vase cislo je 3");
                break;
            case 2:
            case 1:
                System.out.println("Vase cislo je 1 nebo 2");
                break;
                                                                
            default: System.out.println("Vase cislo neni zadne z cisel 1, 2, 3, 4, 5");
        }


    }


    public static void main(String[] args) {
        //prikladIf();
        //prikladWhile();
        //prikladWhileDo();
        prikladSwitch();
    }
}
