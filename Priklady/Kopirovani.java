/*
 * Priklady: Neformátované čtení a zápis textového souboru
 */


package Priklady;

/**
 *
 * @author Felix
 */
import java.io.*;

public class Kopirovani {
    public static void main(String[] args) throws IOException {

        // pro fungovani vytvorte soubor vstupni.txt
        File souborVstupni = new File("vstupni.txt");
        File souborVystupni = new File("vystupni.txt");
        int c;

        if (souborVstupni.exists() == true) {
            FileReader fr = new FileReader(souborVstupni);
            FileWriter fw = new FileWriter(souborVystupni);

            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            fr.close();
            fw.close();
            System.out.println("Kopirovani probehlo uspesne, prohlednete si obsah souboru vystupni.txt.");
        }
    
    }
}
