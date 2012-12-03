/*
 * Maturitni otazka c.: 17
 * Nazev: Programování v jazyce Java – základní datové typy a operátory
 * Zadani:
    * Identifikátory, jednoduché datové typy (celočíselný, znakový, řetězcový, logický, reálný),
    * Deklarace proměnných, deklarace konstant
    * Operátory přiřazení a přetypování, aritmetické operátory, relační operátory, priority vyhodnocování operátorů
 */

package MaturitniOtazky;

/**
 *
 * @author Felix
 */
public class MO17 {

    /* Indentifikatory

     * Tridy(classes) a rozhrani(interfaces): String, StringBuffer, Cloneable
     * Metody(methods) a promene(variables): getColor(), setSize(), pocet, pocetPrvku
     * Baliky(packeges): java.string, java.lang
     * Konstanty(constants): PI, MAX_VALUE, DEFAULT_TITLE
          
     */


    /* Jednoduche datove typy

     * celociselne:
        * byte (8)
        * short (16)
        * int (32)
        * long (64)

     * znakove:
        * char (16)

     * retezcove:
        * String

     * logicke:
        * boolean (true|false)

     * realne:
        * float (32)
        * double (64)

     * cisla v zavorkach udavaji pocet bitu
     */


    /* Deklarace promennych a konstant
     *
     */

    public void deklaracePromennychAkonstantUkazka(){
        
        // zakladni datove typy
        int i; // deklarovani promenne i na integer
        char c, ch; 
        float f, g;

        // muzeme nastavit i prvotni/volaci hodnotu
        int cislo = 5;
        char znak = 'F';

        // deklarovani konstant
        final int CISLICKO = 100;
        final float MOJE_CISLO = 10.2F;

        // lze deklarovat i prazdnou konstantu..
        final String INICIALY;
        // a pozdeji definovat
        INICIALY = "MS";
        
    }

    /*
     * Operatory prirazovani
     */

    public void operatoryPrirazovaniUkazka(){
        
        // prirazeni promene j cislo 5
        int j;
        j = 5;
        // dalsi prirazeni..
        j = j + 10;

        char d = 'z';

        double f = 0;
        f = f + 3.14 * j;

    }

    /*
     * Operatory pretypovani
     */
    public void operatoryPretypovaniUkazka(){

        // operator se zapisuje ve forme kulatych zavorek s prislusnym datovym typem
        int i = 5;
        double d;
        d = (double) i;

        char c = 'A';
        int y = (int) c;
        char g = (char) y;

        // pretypovani ma nejvyssi prioritu, musime davat pozor pri pretypovani vice promennych
        double x;
        x = (double) i + y; // pretypuje se pouze i
        x = (double) (i+y); // pretypuje se vysledek

        // zakazane je pretypovavat nesmysly, napriklad double na void apod..
    }

    public void operatoryPretypovaniRozsirujiciKonverzeUkazka(){

        /*
         * princip:
         * byte->short->int->long->float->double
         * short lze kdykoli prevest na typy int, long, float a double bez operatoru pretypovani '()',
         * ale na typ byte jen s pretypovanim
         *
         * pri provadeni nedochazi ke ztrate informaci
         */

        short s = 10;
        byte b;
        int i;
        float f;
        i = s;
        f = s;
        b = (byte) s;

    }

     public void operatoryPretypovaniZuzujiciKonverzeUkazka(){

         /*
         * princip:
         * double->float->long->int->short->byte
         *
         * pri provadeni dochazi ke ztrate informaci
         */

         short s = 300;
         byte b;

         // b = 44
         b = (byte) s;
         // b = -1
         b = (byte) 255;

         /*
          * short je 16b a byte je 8b, tudiz dochazi 300/256 -> 44
          * byte ma 256 cisel, ale polovina z nich je zaporna -> -1
          */
     }

     public void unarniOperatoryUkazka(){

         // typicky unarni operator je + a -, pisi se pred operand
         int j;
         int i = -3;
         j = -i;

         // SPECIALNI UNARNI OPERATORY
         i = 5;
         j = 1;
         int k;
         i++;           // zvetsi se o 1
         j = ++i;       // i se zvetsi o 1 a tato hodnota se ulozi do j
         j = i++;       // stejne
         k = --j + 2;   // j se zmensi o 1 a priste se 2
     }

     public void binarniOperatoryUkazka(){

         /*
          * + scitani
          * - odecitani
          * * nasobeni
          * / realne deleni
          * / celociselne deleni
          * % deleni modulo (zbytek po celociselnem deleni)
          */

         /*
          * int/int     => celocislene
          * int/float   => realne
          * float/int   => realne
          * float/float => realne
          */

         int i = 5, j = 13;
         j = j / 4;         // j bude 3
         j = i % 3;         // modulo, j bude 2

     }

    public void prirazovaciOperatoryUkazka(){

        /*
         * zakladni operator je: =
         * x = x + 5; (zakladni)
         * x+= 5; (pouzivanejsi)
         */

        /*
         * +=   -> x+y
         * -=   -> x-y
         * *=   -> x*y
         * /-   -> x/y
         * %=   -> x%y
         * &=   -> x&y
         * ^=   -> x^y
         * |=   -> x|y
         * >>=  -> x>>y
         * <<=  -> x<<y
         * >>>= -> x>>>y
         */

        /*
         * casta chyba:
         * j + = 5; (nesmi tam byt mezera)
         */

        int i = 4, j = 5;
        j += i;
        j /= --i;
        j *= i - 2;     // j = j * (i - 2);

        // stejny zapis
        int cislo = 0;
        cislo = cislo + 1;
        cislo += 1;
        ++cislo;
        cislo++;
    }

    public void relacniOperatoryUkazka(){

        /*
         * ==   -> rovnost
         * !=   -> nerovnost
         * &&   -> logicky soucin se zkracenym vyhodnocovanim
         * ||   -> logicky soucet se zkracenym vyhodnocovanim
         * &    -> logicky soucin s uplnym vyhodnocovanim
         * |    -> logicky soucet s uplnym vyhodnocovanim
         * !    -> negace
         * <    -> mensi
         * <=   -> mensi nebo rovno
         * >    -> vetsi
         * >=   -> vetsi nebo rovno
         */


        // rozdil mezi = a ==
        int x;
        x = 5;

        if(x==5){
            // promena x je rovna 5
        }

        
        int i = 1, j = 2, k = 3;
        // ZKRACENE VYHODNOCOVANI
        if(i == 2 && ++j == 3){}
        /*
         * i = 1
         * j = 2
         * automaticky skoncilo po i == 2
         */

        // UPLNE VYHODNOCOVANI
         if(i == 2 & ++j == 3){}
        /*
         * i = 1
         * j = 3
         * provedlo se az do konce
         */

    }

    public void bitoveOperaceUkazka(){

        /*
         * &    -> bitovy soucin - AND
         * |    -> bitovy soucet - OR
         * ^    -> bytovy exlusivni soucet - XOR(nonekvivalence)
         * <<   -> posun doleva
         * >>   -> posun doprava
         * >>>  -> neznamenkovy posun doprava
         * ~    -> jednickovy doplnek - negace bit po bitu - unarni operator
         */

        /*
         * argumenty bitovych operaci nesmi byt promenne FLOAT a DOUBLE
         */
    }

    public void bitovySoucinUkazka(){

        byte i = 7 & 9;     // i bude 1
        /*
         * pokud oba bity jsou 1, vysledek bude 1, jinak 0
        0000 0111 (=7)
      & 0000 1001 (=9)
        --------------
        0000 0001 (=1)
         */

        if(i % 2 == 0){
            // cislo je sude
            // modulo
        }

        if( (i & 1) == 0){
            // cislo je take sude
            // bitova operace (??)
            /*
                0000 1000 (=8)
             &  0000 0001 (=1)
                --------------
                0000 0000 (=0)
             */
            // suda cisla maji nulty byt roven 0, cislovani jde zprava doleva
        }

    }

    public void bitovySoucetUkazka(){

        byte i = 7 | 9;     // i bude 15
        /*
         * pokud alespon jeden bit je 1, vysledek je 1, kdyz jsou oba 0, vysledek je 0
        0000 0111 (=7)
      | 0000 1001 (=9)
        --------------
        0000 1111 (=15)
         */

    }

    public void bitovyExluzivniSoucetUkazka(){

        /*
         * kdyz oba jsou 0 nebo oba 1, tak vysledek je 0
         0000 0111 (=7)
         0000 0101 (=5)
         --------------
         0000 0010 (=2)
         */
        
    }

    public void bitovyPosunDolevaUkazka(){

        /*
         * x << n
         * posune byty v x doleva o n pozic
         * pouziva se pro rychle nasobeni dvema, respektive mocninou dvou
         */

        int x = 1;
        x <<= 3;
        // nasobi x osmi (8 = 2na3)

    }

    public void bitovyPosunDopravaUkazka(){

        /*
         * stejne jako posun doleva akorat se deli
         */
        int x = 8;
        x >>= 3;
        // deli x osmi (8 = 2na3)
    }

    public void priorityVyhodnocovaniOperatoruUkazka(){

        /*
         * . [] (typ)           -> reference, indexovani, pretypovani
         * ! ++ -- - + ~        -> unarni operatory
         * * / %                -> nasobeni a deleni
         * + -                  -> scitani a odcitani
         * << >>> >>            -> posuny bitu
         * < <= >= >            -> relacni operatory
         * == !=                -> rovnost a nerovnost
         * &                    -> logicky i bitovy soucin (AND)
         * ^                    -> logicky i bitovy XOR
         * |                    -> logicky i bitovy soucet (OR)
         * &&                   -> logicky zkraceny soucin
         * ||                   -> logicky zkraceny soucet
         * ?:                   -> ternarni operatory
         * = += -= *= atd.      -> prirazovaci operatory
         * ,                    -> operator carka ve for
         */

    }

    // *******************************************************
    public void bezneChybyUkazka(){

        /*
         * pokus o deleni modulo realnym cislem: i = 5 % 3.14;
         * mezery mezi castmi operatoru: = =, ! =, + =, / =
         * prehozeny znaku v operatorech: =!, =>, =<
         * zamena prirazovaich operatoru = za porovnani ==
         */

    }
    
    public static void main(String[] args) {
    }

}
