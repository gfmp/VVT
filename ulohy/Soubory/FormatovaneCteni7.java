/*
 * 7. V souboru jmena.txt jsou uložena jména osob (max. 14 znaků), každé jméno na jednom řádku.
 * Zapište do souboru tabulka.html tato jména tak, aby vznikla jednoduchá webová stránka obsahující tabulku se jmény.
 */


package Ulohy.Soubory;

import java.io.*;

/**
 *
 * @author Felix
 */
public class FormatovaneCteni7 {
    public static void main(String[] args) {

        String radek;
        try {
            FileReader fr = new FileReader("celajmena.txt");
            PrintWriter pw = new PrintWriter("celajmena-tabulka.html");
            BufferedReader bfr = new BufferedReader(fr);

            pw.println("<table border=\"1\">");
            pw.println("<tr>");
                pw.println("<td>Jmeno</td>");
                pw.println("<td>Prijmeni</td>");
            pw.println("</tr>");

            while( (radek = bfr.readLine()) != null ) {
            pw.println("<tr>");
                String[] udaje = radek.split(" ");
                pw.println("<td>"+udaje[0]+"</td>");
                pw.println("<td>"+udaje[1]+"</td>");
            pw.println("</tr>");
            }

            pw.println("</table>");
            
            System.out.println("Tabulka jmen a prijmeni byla vytvorena");
            pw.close();
            bfr.close();
        }
        catch (Exception e)
        {
            System.err.println("Chyba pri cteni souboru: " + e);
        }

    }
}
