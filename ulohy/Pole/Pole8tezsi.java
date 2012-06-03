/*
 * 8. Napište program, který vyzve uživatele, aby zadal 10 čísel. Tato čísla uložte do pole.
 * Poté hodnoty v poli seřaďte od nejmenší po největší a celé pole vypište na obrazovku.
 * Máte zakázano používat jakékoliv objektové metody.
 * Musíte si vystačit s porovnáváním čísel (příkaz if) a několika málo proměnnými k tomu.
 */


package Ulohy.Pole;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class Pole8tezsi {
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

        for(int x=0; x<p.length; x++){
            for(int i=0; i<p.length; i++){
                if(p[i] > max){
                    max = p[i];
                    key = i;
                }
            }
            //System.out.println("max="+max+" key="+key);
            temp[x] = max;
            p[key] = Integer.MIN_VALUE;
            max = Integer.MIN_VALUE; key = 0;
        }
        //System.out.println("Nejvetsi je:"+max);

        
        //vypsani cisel - od nejvetsiho
        System.out.println("Od nejvetsiho:");
        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i] + ", ");
        }
        //vypsani cisel - od nejmensiho
        System.out.println();
        System.out.println("Od nejmensiho:");
        for(int y=(temp.length-1); y>=0; y--){
            System.out.print(temp[y] + ", ");
        }

    }
}
