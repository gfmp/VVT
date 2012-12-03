/*
 * Priklad: Vytvoření objektu typu File
 */


package Priklady;

/**
 *
 * @author Felix
 */
import java.io.*;
import java.util.*;

class Cesty3 {
    public static void main(String[] args) {
        File s1 = new File("priklad.txt");

        if (s1.exists() == true) {
            System.out.println("Soubor " + s1.getAbsolutePath() + " existuje.");
            System.out.println(new Date(s1.lastModified()));
            System.out.println(s1.length()+ " bytu");
        }
        else {
            System.out.println("Soubor " + s1.getAbsolutePath() + " neexistuje.");
        }

        System.out.println("canRead() = " + (s1.canRead() ? true : false));
        System.out.println("canWrite() = " + (s1.canWrite() ? true : false));
        System.out.println("compareTo() = " + (s1.compareTo(new File("priklad2.txt")) == 1 ? true : false));
        System.out.println("exists() = " + (s1.exists() ? true : false));
        System.out.println("isAbsolute() = " + (s1.isAbsolute() ? true : false));
        System.out.println("isDirectory() = " + (s1.isDirectory() ? true : false));
        System.out.println("isFile() = " + (s1.isFile() ? true : false));
        System.out.println("isHidden() = " + (s1.isHidden() ? true : false));
        /*
         * True/False metody:
         * canRead(),
         * canWrite(),
         * compareTo(),
         * exists(),
         * isAbsolute(),
         * isDirectory(),
         * isFile(),
         * isHidden().
         */
    }
}

