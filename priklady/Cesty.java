/*
 * Priklad: Vytvoření objektu typu File
 */


package Priklady;

/**
 *
 * @author Felix
 */
import java.io.*;

class Cesty {
  public static void main(String[] args) throws IOException {
    File s1 = new File("priklad.txt"); // v aktuální složce
    File s2 = new File("podslozka" + File.separator + "priklad.txt"); // relativní cesta
    File s3 = new File(File.separator + "priklad.txt"); // od kořenové složky

    System.out.println(s1.getAbsolutePath());
    System.out.println(s2.getAbsolutePath());
    System.out.println(s3.getAbsolutePath());

      System.out.println("getAbsolutePath() = " + s2.getAbsolutePath());
      System.out.println("getCanonicalPath() = " + s2.getCanonicalPath());
      System.out.println("getName() = " + s2.getName());
      System.out.println("getPath() = " + s2.getPath());
      System.out.println("getParent() = " + s2.getParent());
      System.out.println("lastModified() = " + s2.lastModified());
      System.out.println("length() = " + s2.length());

    /*
     * Informační metody:
     * getAbsolutePath(),
     * getCanonicalPath(),
     * getName(),
     * getPath(),
     * getParent(),
     * lastModified(),
     * length(),
     * list() {returns array of String},
     * listFiles() {returns array of File objects}.
     */
  }
}

