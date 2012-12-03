/*
 * Priklad: V souboru cisla.txt jsou uložena přirozená čísla oddělená mezerami.
 * Sečtěte všechna tato čísla a výsledek vypište na obrazovku.
 */


package Priklady;

import java.io.*;

/**
 *
 * @author Felix
 */
public class FormatovaneCteni {
    public static void main(String[] args) {

        String radek;
        int soucet = 0;
        try {
            FileReader fr = new FileReader("cisla.txt");
            BufferedReader bfr = new BufferedReader(fr);
            while((radek = bfr.readLine()) != null) {

                String[] cisla = radek.split(" ");

                for (int i=0; i < cisla.length; i++) {
                soucet = soucet + Integer.parseInt(cisla[i]);
                }

            }
            System.out.println("Soucet je: " + soucet);
            bfr.close();
        }
        catch (Exception e)
        {
            System.err.println("Chyba pri cteni souboru: " + e);
        }

    }
}
