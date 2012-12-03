/*
 * 2. Zkopírujte obsah souboru vstupni.txt do souboru vystupni.txt tak, že všechny znaky "a" nahradíte znakem "*".
 */


package Ulohy.soubory;

/**
 *
 * @author Felix
 */
import java.io.*;

public class Kopirovani2 {
    public static void main(String[] args) throws IOException {

        // pro fungovani vytvorte soubor vstupni.txt
        File souborVstupni = new File("vstupni.txt");
        File souborVystupni = new File("vystupni.txt");
        int c;

        if (souborVstupni.exists() == true) {
            FileReader fr = new FileReader(souborVstupni);
            FileWriter fw = new FileWriter(souborVystupni);

            while ((c = fr.read()) != -1) {
                if(c == (int)'a'){
                    fw.write('*');
                }else{
                    fw.write(c);
                }
            }

            System.out.println("Vsechna acka byla nahrazena");
            fr.close();
            fw.close();
        }

    }
}
