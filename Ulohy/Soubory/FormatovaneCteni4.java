/*
 * 4. V souboru cisla.txt jsou uložena přirozená čísla oddělená mezerami.
 Zapište do souboru vystup.txt druhé mocniny těchto čísel.
 */


package Ulohy.Soubory;

import java.io.*;

/**
 *
 * @author Felix
 */
public class FormatovaneCteni4 {
    public static void main(String[] args) {

        String radek;
        int a;
        try {
            FileReader fr = new FileReader("cisla.txt");
            PrintWriter pw = new PrintWriter("cisla-mocniny.txt");
            BufferedReader bfr = new BufferedReader(fr);
            while((radek = bfr.readLine()) != null) {

                String[] cisla = radek.split(" ");

                for (int i=0; i < cisla.length; i++) {
                    a = Integer.parseInt(cisla[i]);
                        pw.print(a*a+", ");
                }

            }

            System.out.println("Soubor cisla-mocniny.txt obsahuje 2 mocniny cisel z cisla.txt");
            pw.close();
            bfr.close();
        }
        catch (Exception e)
        {
            System.err.println("Chyba pri cteni souboru: " + e);
        }

    }
}
