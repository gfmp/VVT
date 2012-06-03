/*
 * 1. Zjistěte a vypište na obrazovku, kolikrát se v určitém textovém souboru vyskytuje znak "a".
 */


package Ulohy.soubory;

/**
 *
 * @author Felix
 */
import java.io.*;

public class Kopirovani1 {
    public static void main(String[] args) throws IOException {

        // pro fungovani vytvorte soubor vstupni.txt
        File souborVstupni = new File("vstupni.txt");
        int c, pocetAcek = 0;

        if (souborVstupni.exists() == true) {
            FileReader fr = new FileReader(souborVstupni);

            while ((c = fr.read()) != -1) {
                if(c == (int)'a'){
                    pocetAcek++;
                }
            }

            System.out.println("Pocet pismen 'a' v souboru "+souborVstupni.getName()+" je "+pocetAcek);
            fr.close();
        }

    }
}
