package skrytecislo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class HadaniCisel {

    /* 
     * Promenne
     */
    private int intervalFrom; // interval od
    private int intervalTo; // interval do
    private int attempt = 1; // pocet pokusu
    private StringBuilder logger = new StringBuilder(); // pro zaznam naseho hadani
    private Scanner sc = new Scanner(System.in); // uzivatelsky vstup

    /**
     * Nastavuje interval od
     */
    private void setIntervalFrom(int interval) {
        this.intervalFrom = interval;
    }

    /**
     * Nastavuje interval do
     */
    private void setIntervalTo(int interval) {
        this.intervalTo = interval;
    }

    /**
     * Vraci nahodne cislo z intervalu od - do
     *
     * @param from
     * @param to
     */
    private int getRand(int from, int to) {
        int num = (int) (from + (Math.random() * (to - from)));
        return num;
    }

    /**
     * Prida zaznam o hadani
     *
     * @param msg
     */
    private void addLog(String msg) {
        this.logger.append(msg).append("\r\n");
    }

    /**
     * Zapise data do souboru
     *
     * @param filename
     * @param data
     */
    private void write2file(String filename, String data) {
        try {
            File f = new File(filename);
            // vytvorime zapisovaci sluzby
            FileWriter fw = new FileWriter(f);
            // zapiseme data
            fw.write(data);
            // zavreme soubor
            fw.close();
        } catch (IOException ex) {
            System.out.println("Pozadovany soubor " + filename + " neexistuje nebo nejde vytvorit.");
        }
    }

    /**
     * Hadani
     *
     * @param tip
     */
    private void startTips(int tip) {
        this.addLog("Pokus #" + this.attempt + ": " + tip);

        // Vypiseme tip pocitace
        System.out.println("Muj tip #" + this.attempt + " je " + tip);
        String userin;

        // Zeptame se se na dane cislo
        System.out.print("Je to to cislo? (ano/ne) : ");
        userin = this.sc.next();

        // Overime jestli je nebo neni
        if (userin.equalsIgnoreCase("ne")) {

            // pricteme pokusy
            this.attempt++;

            // je cislo vetsi nebo mensi?
            System.out.print("Je vase cislo vetsi? (ano/ne) : ");
            userin = this.sc.next();
            if (userin.equals("ano")) {
                // je vetsi
                this.setIntervalFrom(tip); // aby se znova nehadalo min nez dane cislo
                this.addLog("Hadane cislo je vetsi nez cislo " + tip);
                // hadame znovu
                this.startTips(this.getRand(tip + 1, this.intervalTo));
            } else {
                // je mensi
                this.setIntervalTo(tip); // aby se znova nehadalo vic nez dane cislo
                this.addLog("Hadane cislo je mensi nez cislo " + tip);
                // hadame znovu..
                this.startTips(this.getRand(this.intervalFrom, tip - 1));
            }
        } else if (userin.equalsIgnoreCase("ano")) {
            System.out.println("Bingo!");

            this.addLog("----------------KONEC HADANI----------------");
            this.addLog("Vase myslene cislo je: " + tip);
            this.write2file("D:/JAVA/CVUT/src/skrytecislo/postup.txt", this.logger.toString());
        } else {
            System.out.println("Chybny zapis. Zkuste to znovu");
            this.startTips(tip);
        }
    }

    private void processIntervals() {
        try {
            // Nastavime prislusne intervaly
            System.out.print("Interval od:");
            int from = Integer.parseInt(this.sc.next());
            this.setIntervalFrom(from);
            this.addLog("Zadani interval od " + this.intervalFrom);

            System.out.print("Interval do:");
            int to = Integer.parseInt(this.sc.next());
            this.setIntervalTo(to);
            this.addLog("Zadani interval do " + this.intervalTo);

        } catch (NumberFormatException e) {
            System.out.println("Nezadali jste spravne interval, zkuste to prosim znovu.");
            this.processIntervals();
        }
    }

    /**
     * Startovaci fce
     *
     * @param args
     */
    public static void main(String[] args) {
        // Instance hadani
        Hadanicisel hadani = new Hadanicisel();

        // Spusti hledani intervalu
        hadani.processIntervals();

        // A jde se hadat..
        System.out.println("Jdu hadat:");
        hadani.addLog("----------------ZACATEK HADANI----------------");
        int rand = hadani.getRand(hadani.intervalFrom, hadani.intervalTo);
        //System.out.println("debug: prvni tip " + rand);
        hadani.startTips(rand);
    }
}
