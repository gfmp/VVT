/*
 * Priklad: Formátované čtení a zápis textového souboru
 */


package Priklady;

/**
 *
 * @author Felix
 */
import java.io.*;

public class FormatovanyZapis {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("pokus.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Ahoj");
            pw.close();
            System.out.println("Zapis do souboru pokus.txt probehl uspesne.");
        }
        catch (Exception e)
        {
          System.err.println("Chyba pri zapisu do souboru: " + e);
        }
    }
}
