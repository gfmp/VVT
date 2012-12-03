
/**
 *
 * @author Felix
 */
public class Morseovka {

    public static void main(String[] args) {
        String text = "Ahoj jak se mas? Ja se mam celkem fajn. Vcera sem oslavil 20tiny.! Hehe.";
        String znak;

        Abeceda abcd = new Abeceda();

        for (int i = 0; i < text.length(); i++) {
            znak = String.valueOf(text.charAt(i)).toUpperCase();
            System.out.print(abcd.hledejKod(znak));
        }

    }
}
