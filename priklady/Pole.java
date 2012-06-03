/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Priklady;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
class Pole {
    public static void main(String[] args) {
        int[] p = new int[2];

        int a = -5;
        int b = Integer.MIN_VALUE;
        if(a>b){
            System.out.println("a je vetsi");
        }else{
            System.out.println("b je vetsi");
        }

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<=4; i++)
        {
            System.out.print("Napis cislo: ");
            p[i] = sc.nextInt();
        }
        System.out.println("V poli jsou cisla: ");
        for (int i=0; i<=4; i++)
        {
            System.out.print(p[i]+", ");
        }
    }
} 
