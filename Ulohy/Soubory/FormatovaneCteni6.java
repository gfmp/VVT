/*
 * 6. V souboru jmena.txt jsou uložena jména osob (max. 14 znaků), každé jméno na jednom řádku.
 * V souboru prijmeni.txt jsou uložena příjmení osob (max. 14 znaků), každé jméno na jednom řádku.
 * Zapište do souboru vystup.txt tato jména a příjmení tak, aby na každém řádku bylo vždy jedno jméno a jedno příjmení.
 */


package Ulohy.Soubory;

import java.io.*;

/**
 *
 * @author Felix
 */
public class FormatovaneCteni6 {
    public static void main(String[] args) {

        String jmeno, prijmeni;
        try {
            FileReader fr1 = new FileReader("jmena.txt");
            FileReader fr2 = new FileReader("prijmeni.txt");
            PrintWriter pw = new PrintWriter("jmena+prijmeni.txt");
            BufferedReader bf1 = new BufferedReader(fr1);
            BufferedReader bf2 = new BufferedReader(fr2);
            while((jmeno = bf1.readLine()) != null && (prijmeni = bf2.readLine()) != null ) {
                pw.println(jmeno+" "+prijmeni);
            }

            System.out.println("Vsechna jmena a prijmeni byla uspesne spojena.");
            pw.close();
            bf1.close();
            bf2.close();
        }
        catch (Exception e)
        {
            System.err.println("Chyba pri cteni souboru: " + e);
        }

    }
}
