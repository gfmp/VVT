/*
 * 3. Upravte kód předchozí ukázky tak, aby se pole obsahovalo textové řetězce (objekty třídy String).
 * Například může pole obsahovat textové řetězce "ahoj", "nazdar", "cau".
 * Potom toto pole projděte pomocí for cyklu a zjistěte, jestli se v něm
 * vyskytuje určitý hledaný textový řetězec (například "nazdar").
 */


package Ulohy.NovaSyntaxe;

/**
 *
 * @author Felix
 */
class NovaSyntaxePole3 {
    public static void main(String[] args) {
        String[] pozdravy = new String[] {"ahoj", "cau", "te pero", "zdar", "nazdar"};
        String hledam = "nazdar";
        int ok = 0;
        for (String x: pozdravy)
        {
            if(x.equals(hledam) == true){
                ok = 1;
                System.out.println("Pole pozdravy obsahuje pozdrav " + hledam);
            }
        }

        if(ok == 0) System.out.println("V celem poli neni pozdrav " + hledam);

    }
}
