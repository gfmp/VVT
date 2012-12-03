package sachy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

/**
 *
 * @author Felix
 */
public class Sachy {

    // vytvori pole 8x8
    public Sachovnice sachovnice = new Sachovnice();
    public File soubor;
    public boolean error = false;

    public static void main(String[] args) {

        Sachy hra = new Sachy();
        hra.start();
        hra.hrej();
    }

    public void start(){

    // manualne prida figurky
    //sachovnice.addFigure('K', new ChessNotation("c2"));
    //sachovnice.addFigure('V', new ChessNotation("f5"));

    // automaticky prida figurky
    this.loadFigures();

    // debug
    this.sachovnice.vypis();

    }

    public void hrej(){

        if(this.error) System.exit(0);
        /*
        for(Figurka f:this.sachovnice.figurky){
            System.out.println("Na sachovnici je "+f.getName());
        }
         * 
         */

        //System.out.println("Kontroluji kolize:");

        //Figurka f1 = this.sachovnice.figurky[0];
        //Figurka f2 = this.sachovnice.figurky[1];

        for(Figurka f1:this.sachovnice.figurky){
            if(f1 instanceof Figurka){
                for(Figurka f2:this.sachovnice.figurky){
                    if(!f1.equals(f2) && f2 instanceof Figurka){
                        f1.kolize(f2);
                    }
                }
            }
        }

        //System.out.println("Kolize "+f2.getName()+" vs "+f1.getName());
        /*for(int[] x:f2.getAttacks()){
            System.out.println(Arrays.toString(x));
        }
         */
    }

    public void loadFigures(){
        String line;
        try {
            FileReader fr = new FileReader("sachovnice.txt");
            BufferedReader bfr = new BufferedReader(fr);
            while((line = bfr.readLine()) != null) {

                String[] data = line.split(" ");
                this.sachovnice.addFigure(data[0].charAt(0), new ChessNotation(data[1]));
            }
            bfr.close();
            this.error = false;
        }
        catch (Exception e)
        {
            this.error = true;
            System.err.println("Chyba pri cteni souboru: " + e);
            System.out.println("System nemohl nacist zadne figurky. Nemuzete hrat.");
        }
    }
}
