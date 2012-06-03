/*
 * Maturitni otazka c.: 21
 * Nazev: Programování v jazyce Java – pole, řetězce
 * Zadani:
    * Deklarace pole, délka pole, inicializované pole, jednorozměrná a dvourozměrná pole,
    * Vytvoření řetězce, porovnávání řetězců, převod na malá či velká písmena, spojování řetězců,
    * získání části řetězce, získání znaku, hledání znaku,
    * konverze základních datových typů na řetězec a naopak, metoda toString(), třída StringBuffer

 */

package MaturitniOtazky;

import java.util.Arrays;

/**
 *
 * @author Felix
 */
public class MO21 {

    /*
     * Deklarace pole
     */
    public static void deklaracePole(){
        // 1. typ
        int[] pole = new int[10];
        // 2. typ
        String[] array;
        array = new String[15];
        // 3.typ
        float[] seznam = new float[] {1,2,3,4,5};
    }

    /*
     * Delka pole
     */
    public static void delkaPole(){
        int[] pole = new int[10];
        System.out.println("Delka pole: "+pole.length);
    }

    /*
     * Inicializace pole
     */
    public static void inicializacePole(){
        int[] pole = new int[5];
        for (int i=0; i<pole.length; i++)
        {
            pole[i] = i*i;
        }
        System.out.println("V poli je: "+Arrays.toString(pole));
    }

    /*
     * Rozmerna pole
     */
    public static void rozmernaPole(){
        int[] pole; // jednozmerne
        int[][] pole2; // dvojrozmerne
        int[][][] pole3; // trojrozmerne ..
        // atd..
    }

    /*
     * Razeni pole
     */
    public static void razeniPole(){
        int[] pole = {2,4,-5,99,0};
        Arrays.sort(pole);
        System.out.println("Serazene pole: "+Arrays.toString(pole));
    }

    /*
     * Vytvoreni retezce
     */
    public static void vytvoreniRetezce() {
        String s1, s2, s3, s4, s5, s6, s7;
        byte[] bajty = {(byte)'E', (byte)'v', (byte)'a'};
        char[] znaky = {'M', 'a', 'r', 't', 'i', 'n', 'a'};
        StringBuffer buf = new StringBuffer("dobry den");

        s1 = new String("cao");
        System.out.println("s1:" + s1);
        s2 = new String(s1);
        System.out.println("s2:" + s2);
        s3 = new String(bajty);
        System.out.println("s3:" + s3);
        s4 = new String(bajty, 1, 2);
        System.out.println("s4:" + s4);
        s5 = new String(znaky);
        System.out.println("s5:" + s5);
        s6 = new String(znaky, 3, 4);
        System.out.println("s6:" + s6);
        s7 = new String(buf);
        System.out.println("s7:" + s7);
        System.out.println("s7 = " + s7.length());
    }

    /*
     * Porovnavani retezcu
     * compareTo(),compareToIgnoreCase(),equals(),equalsIgnoreCase()
     */
    public static void porovnavaniRetezcu() {
        String s1, s2, s3, s4;
        s1 = new String("ahoj");
        s2 = new String("ahoi");
        s3 = new String("AHOJ");

        //compateTo
        /*
         * vraci int
         * 0 < = retezec v parametru vetsi
         * 0   = shoda
         * int > 0 = retezec v par. mensi
         */

        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
        System.out.println("s2.compareTo(s1): " + s2.compareTo(s1));
        System.out.println("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));

        //equals
        /*
         * vraci boolean
         * true = shoda
         * false = neshoda
         */

        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
    }

    /*
     * Prevod mala/velka
     */
    public static void prevodRetezce() {
        String s1 = new String("aHoJ");
        System.out.println("Mala: "+s1.toLowerCase());
        System.out.println("Velka: "+s1.toUpperCase());
    }

    /*
     * Spojovani retezcu
     */
    public static void spojovaniRetezcu() {
        String s1 = "mala a";
        String s2 = " VELKA";
        String s3, s4;

        s3 = s1 + s2;
        s4 = s1.concat(s2);
        System.out.println(s1);  // "mala a"
        System.out.println(s2);  // " VELKA"
        System.out.println(s3);  // "mala a VELKA"
        System.out.println(s4);  // "mala a VELKA"
    }

    /*
     * Nahrada znaku
     */
    public static void nahradaZnaku() {
        String s2, s1 = "cacao";

        s2 = s1.replace('c', 'k');
        System.out.println(s1);  // "cacao"
        System.out.println(s2);  // "kakao"
    }

    /*
     * Cast retezce
     */
    public static void castRetezce() {
        String s2, s3, s1 = "mala a VELKA";

        s2 = s1.substring(5);
        s3 = s1.substring(5, 9);
        System.out.println(s2);  // "a VELKA"
        System.out.println(s3);  // "a VE"
    }

    /*
     * Ziskani znaku
     */
    public static void ziskaniZnaku() {
        String s1 = "mala a VELKA";
        System.out.println("Znak na pozici 5 je '"+s1.charAt(5)+"'");
    }

    /*
     * Zacatek a konec retezce
     */
    public static void zacatekAkonec() {
        String s = "mala a VELKA";

        if (s.startsWith("mala") == true)
          System.out.println("Zacina na \"mala\"");
        if (s.endsWith("mala") == false)
          System.out.println("Nekonci na \"mala\"");
    }

    /*
     * Odtrimovani (odriznuti bilych znaku na zacatku a na konci)
     */
    public static void odtrimovani() {
        String s2, s1 = "\r\n\t ahoj\t \r\n";

        s2 = s1.trim();
        System.out.println("Zacatek:" + s1 + ":konec");
        System.out.println("Zacatek:" + s2 + ":konec");
    }

    /*
     * Hledani znaku
     */
    public static void hledaniZnaku() {
        String s = "mala a VELKA";
        int i;

        i = s.indexOf('a');
        System.out.println("Prvni a je na " + i + ". pozici");
        i = s.indexOf('a', i + 1);
        System.out.println("Dalsi a je na " + i + ". pozici");
        i = s.lastIndexOf('a');
        System.out.println("Posledni a je na " + i + ". pozici");
        i = s.lastIndexOf('a', i - 1);
        System.out.println("Predposledni a je na "+ i +". pozici");
    }

    /*
     * Konverze základních datových typů na řetězec
     */
    public static void KonverzeToString() {
        boolean b = true;
        int i = 1234567;
        double d = Math.PI;
        String s;

        s = String.valueOf(b);
        System.out.println("b: " + s);
        s = String.valueOf(i);
        System.out.println("i: " + s);
        s = String.valueOf(d);
        System.out.println("d: " + s);

        // ---------------------------------------------


        System.out.println(Math.PI);   // 3.141592656589793
        s = String.valueOf(Math.PI);
        i = s.indexOf('.');
        s = s.substring(0, i + 6);
        System.out.println(s);         // 3.14159

        // ---------------------------------------------

        int u = 254;

        System.out.println(Integer.toBinaryString(u));  // 11111110
        System.out.println(Integer.toOctalString(u));   // 376
        System.out.println(Integer.toHexString(u));     // fe
    }

    /*
     * Konverze základních datových typů z řetězec
     */
    public static void KonverzeFromString() {

        double d1 = Double.valueOf("3.14").doubleValue();
        double d2 = new Double("3.14").doubleValue();
        boolean b = Boolean.valueOf("true").booleanValue();
        int i = Integer.valueOf("123").intValue();

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("b  = " + b);
        System.out.println("i  = " + i);

        // ---------------------------------------------

        int j = Integer.valueOf("1A2B", 16).intValue();
        System.out.println("j  = " + j);

        long l1 = Long.parseLong("12345");
        long l2 = Long.parseLong("1A2B", 16);
        double d = Double.parseDouble("123.5");
        float f = Float.parseFloat("1.235e2");
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
    }

    /*
     * Vice metod jednim prikazem
     */
    public static void viceMetod1prikazem() {
        String s1 = "\r\n\t cacao\t \r\n";
        int i;

        i = s1.trim().toUpperCase().substring(2).indexOf('O');
        System.out.println("O je " + (i + 1) + ".znak");
    }

    /*
     * Deleni retezce
     */
    public static void deleniRetezce() {
        String radka = "123  45 6 789";
        String [] podretezce = radka.split(" ");
        for (int i = 0;  i < podretezce.length;  i++) {
          if (podretezce[i].length() > 0) {
            int cislo = Integer.parseInt(podretezce[i]);
            System.out.println(cislo);
          }
        }
    }

    /*
     * toString()
     * dole ..
     */

    /*
     * StringBuffer()
     */
    public static void StringBuffer() {
        StringBuffer b1, b2, b3;

        b1 = new StringBuffer();
        b2 = new StringBuffer(100);
        b3 = new StringBuffer("Ahoj");

        System.out.println(b1.length() +" " + b1.capacity()); // 0 16
        System.out.println(b2.length() +" " + b2.capacity()); // 0 100
        System.out.println(b3.length() +" " + b3.capacity()); // 4 20

        b1.setLength(18);
        b2.ensureCapacity(110);
        b3.setLength(3);

        System.out.println(b1.length() +" " + b1.capacity()); // 18 34
        System.out.println(b2.length() +" " + b2.capacity()); // 0 202
        System.out.println(b3.length() +" " + b3.capacity()); // 3 20
    }
    /*
     * Existuje spousta metod pro praci s tridou StringBuffer()
     * reverse() - obrati retezec
     * append() - prida nakonec retezce
     * delete(int x,int y) - smaze od xIndexu do yIndexu
     * deleteCharAt(int x) - smazet znak na pozici x
     * insert(int x,typ t) - prida jakykoli dat.typ na pozizi x
     * replace(int x,int y, String s) - nahradi jeden podretezec druhym
     * charAt(int x) - vrati znak na pozici x
     * setCharAt(int x,char c) - -||-
     * toString() - prevede StringBuffer na String
     * substring(int x,int y) - prevede cast StringBufferu na String
     */

    public static void main(String[] args) {
        StringBuffer();
    }
}

/*
 * Metoda toString()
 * = zazracna!!
 */

class MujString {
    int hodnota;

    MujString(int h) { hodnota = h; }

    public String toString() {  // public je nutny
        String jmenoTridy = new String(getClass().getName());
        return (jmenoTridy + ": " + hodnota);
    }
    void puvodniToString() {
        System.out.println(super.toString());
    }

    public static void main(String[] args) {
        MujString s1 = new MujString(5);
        s1.puvodniToString();
        System.out.println(s1.toString());
    }
}