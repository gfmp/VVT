/*
 * 5. V souboru celajmena.txt jsou uložena jména osob (max. 14 znaků), každé jméno na jednom řádku.
 * Zapište do souboru celajmena-vystup.txt tato jména spolu s pořadovým číslem jména.
 */


package Ulohy.Soubory;

import java.io.*;

/**
 *
 * @author Felix
 */
public class FormatovaneCteni5 {
    public static void main(String[] args) {

        String radek;
        int a = 0;
        try {
            FileReader fr = new FileReader("celajmena.txt");
            PrintWriter pw = new PrintWriter("celajmena-vystup.txt");
            BufferedReader bfr = new BufferedReader(fr);
            while((radek = bfr.readLine()) != null) {
                pw.println(++a+". "+radek);
            }

            System.out.println("Soubor celajmena-vystup.txt uspesne vytvoren.");
            pw.close();
            bfr.close();
        }
        catch (Exception e)
        {
            System.err.println("Chyba pri cteni souboru: " + e);
        }

    }
}
