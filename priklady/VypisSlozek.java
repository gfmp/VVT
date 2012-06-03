/*
 * Priklad: Vytvoření objektu typu File
 */

package Priklady;

/**
 *
 * @author Felix
 */
import java.io.*;

public class VypisSlozek {
    public static void main(String[] args) {
        File aktualniSlozka = new File(System.getProperty("user.dir"));
        String[] jmena;
        jmena = aktualniSlozka.list();
        for (int i = 0;  i < jmena.length;  i++) {
            System.out.println(jmena[i]);
        }
    }
}

