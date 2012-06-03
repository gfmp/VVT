/*
 * 3. Napište program, kterému na vstupu zadáte přirozené číslo n.
 * Program poté vygeneruje tabulku druhých mocnin čísel od 1 do n (podobnou jako v předchozí úloze)
 * a zapíše ji do souboru mocniny.html v podobě jednoduché webové stránky.
 */


package Ulohy.Soubory;

/**
 *
 * @author Felix
 */
import java.io.*;
import java.util.Scanner;

public class FormatovanyZapis3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Napiste nejake cislo: ");
        int a = sc.nextInt();
        
        try {
            FileWriter fw = new FileWriter("pokus3.html");
            PrintWriter pw = new PrintWriter(fw);

            for(int i=1;i<=a;i++){
                pw.println("Cislo: <b>"+i+"</b> a jeho mocnina <b>"+i*i+"</b><br>");
            }

            pw.close();
            System.out.println("Zapis do souboru pokus3.html probehl uspesne.");
        }
        catch (Exception e)
        {
          System.err.println("Chyba pri zapisu do souboru: " + e);
        }
    }
}
