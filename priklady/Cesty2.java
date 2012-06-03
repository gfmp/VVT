/*
 * Priklad: Vytvoření objektu typu File
 */



package Priklady;

/**
 *
 * @author Felix
 */
import java.io.*;

class Cesty2 {
    public static void main(String[] args) {
        
        File d1 = new File("podslozka");

        if (d1.exists() == true) {
            System.out.println("Slozka " + d1.getAbsolutePath() + " existuje.");
        }
        else {
            d1.mkdir();
            System.out.println("Slozka '" + d1.getName() + "' byla vytvorena");
        }

    /*
     * Modifikační metody:
     * delete(), 
     * deleteOnExit(),
     * mkdir(),
     * mkdirs(),
     * renameTo(),
     * setLastModified(),
     * setReadOnly().
     */
  }
}
