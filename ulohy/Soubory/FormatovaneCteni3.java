/*
 * 3. V souboru cisla.txt jsou uložena přirozená čísla oddělená mezerami.
 * Zapište do souboru vystup.txt všechna sudá čísla obsažená v souboru cisla-vystup.txt
 */


package Ulohy.Soubory;

import java.io.*;

/**
 *
 * @author Felix
 */
public class FormatovaneCteni3 {
    public static void main(String[] args) {

        String radek;
        try {
            FileReader fr = new FileReader("cisla.txt");
            PrintWriter pw = new PrintWriter("cisla-vystup.txt");
            BufferedReader bfr = new BufferedReader(fr);
            while((radek = bfr.readLine()) != null) {

                String[] cisla = radek.split(" ");

                for (int i=0; i < cisla.length; i++) {
                    if(Integer.parseInt(cisla[i])%2 == 0){
                        pw.print(cisla[i]+", ");
                    }
                }

            }

            System.out.println("Vsechna suda cisla ze souboru cisla.txt jsou nyni v cisla-vystup.txt");
            pw.close();
            bfr.close();
        }
        catch (Exception e)
        {
            System.err.println("Chyba pri cteni souboru: " + e);
        }

    }
}
