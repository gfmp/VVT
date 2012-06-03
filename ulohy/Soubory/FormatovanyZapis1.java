/*
 * 1.Zapište do souboru posloupnost.txt čísla od 1 do 100 tak, aby na každém řádku bylo vždy právě 10 čísel.
 */


package Ulohy.Soubory;

/**
 *
 * @author Felix
 */
import java.io.*;

public class FormatovanyZapis1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("pokus1.txt");
            PrintWriter pw = new PrintWriter(fw);

            for(int i=1;i<=100;i++){
                pw.print(i+",");
                if(i%10 == 0){
                    pw.print("\n");
                }
            }

            pw.close();
            System.out.println("Zapis do souboru pokus1.txt probehl uspesne.");
        }
        catch (Exception e)
        {
          System.err.println("Chyba pri zapisu do souboru: " + e);
        }
    }
}
