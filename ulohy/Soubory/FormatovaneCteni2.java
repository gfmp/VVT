/*
 * 2. V souboru cisla.txt jsou uložena přirozená čísla oddělená mezerami.
 * Najděte největší z těchto čísel a vypište jej na obrazovku.
 */


package Ulohy.Soubory;

import java.io.*;

/**
 *
 * @author Felix
 */
public class FormatovaneCteni2 {
    public static void main(String[] args) {

        String radek;
        int max = 0;
        try {
            FileReader fr = new FileReader("cisla.txt");
            BufferedReader bfr = new BufferedReader(fr);
            while((radek = bfr.readLine()) != null) {

                String[] cisla = radek.split(" ");

                for (int i=0; i < cisla.length; i++) {
                    if(max < Integer.parseInt(cisla[i])) max = Integer.parseInt(cisla[i]);
                }

            }

            System.out.println("Nejvetsi cislo je: "+max);
            bfr.close();
        }
        catch (Exception e)
        {
            System.err.println("Chyba pri cteni souboru: " + e);
        }

    }
}
