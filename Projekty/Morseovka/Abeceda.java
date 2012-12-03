import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Felix
 */
public class Abeceda {

    private HashMap<String, String> tabulka = new HashMap<String, String>();
    private String oddelovacPismen = "/";
    private String oddelovacSlov = "/";

    public Abeceda() {
        // A-Z
        this.tabulka.put("A", ".-");
        this.tabulka.put("B", "-...");
        this.tabulka.put("C", "-.-.");
        this.tabulka.put("D", "-..");
        this.tabulka.put("E", ".");
        this.tabulka.put("F", "..-.");
        this.tabulka.put("G", "--.");
        this.tabulka.put("H", "....");
        this.tabulka.put("CH", "----");
        this.tabulka.put("I", "..");
        this.tabulka.put("J", ".---");
        this.tabulka.put("K", "-.-");
        this.tabulka.put("L", ".-..");
        this.tabulka.put("M", "--");
        this.tabulka.put("N", "-.");
        this.tabulka.put("O", "---");
        this.tabulka.put("P", ".--.");
        this.tabulka.put("Q", "--.-");
        this.tabulka.put("R", ".-.");
        this.tabulka.put("S", "...");
        this.tabulka.put("T", "-");
        this.tabulka.put("U", "..-");
        this.tabulka.put("V", "...-");
        this.tabulka.put("W", ".--");
        this.tabulka.put("X", "-..-");
        this.tabulka.put("Y", "-.--");
        this.tabulka.put("Z", "--..");
        // 0-9
        this.tabulka.put("1", ".----");
        this.tabulka.put("2", "..---");
        this.tabulka.put("3", "...--");
        this.tabulka.put("4", "....-");
        this.tabulka.put("5", ".....");
        this.tabulka.put("6", "-....");
        this.tabulka.put("7", "--...");
        this.tabulka.put("8", "---..");
        this.tabulka.put("9", "----.");
        this.tabulka.put("0", "-----");
        // dalsi znaky
        this.tabulka.put(".", ".-.-.-.");
        this.tabulka.put(",", "--..--");
        this.tabulka.put("?", "..--..");
        this.tabulka.put("!", "--..-");
        this.tabulka.put(";", "-.-.-.");
        this.tabulka.put(":", "---...");
        this.tabulka.put("(", "--...");
        this.tabulka.put(")", "-.--.-");
        this.tabulka.put("-", "-....-");
        this.tabulka.put("_", "..--.-");
        this.tabulka.put("@", ".--.-.");
        // mezera
        this.tabulka.put(" ", "/");
    }

    public String hledejKod(String znak) {
        for (Map.Entry e : this.tabulka.entrySet()) {
            //Map.Entry entry = (Map.Entry) o;
            if (znak.equals(" ")) { // mezera
                return this.oddelovacSlov;
            } else if (e.getKey().equals(znak)) {
                return e.getValue().toString() + this.oddelovacPismen;
            }
        }
        return null;
    }

    public String hledejZnak(String kod) {
        if (this.tabulka.containsKey(kod)) {
            return this.tabulka.get(kod).toString();
        }
        return null;
    }
}
