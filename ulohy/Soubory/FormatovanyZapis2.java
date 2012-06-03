/*
 * 2. Zapište do souboru mocniny.txt čísla od 1 do 100 tak spolu s jejich druhými mocninami.
 * Na každém řádku bude vždy jen jedno číslo spolu se svou mocninou.
 */


package Ulohy.Soubory;

/**
 *
 * @author Felix
 */
import java.io.*;

public class FormatovanyZapis2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("pokus2.txt");
            PrintWriter pw = new PrintWriter(fw);

            for(int i=1;i<=100;i++){
                pw.print(i+" - " +i*i + "\n");
            }

            pw.close();
            System.out.println("Zapis do souboru pokus2.txt probehl uspesne.");
        }
        catch (Exception e)
        {
          System.err.println("Chyba pri zapisu do souboru: " + e);
        }
    }
}
