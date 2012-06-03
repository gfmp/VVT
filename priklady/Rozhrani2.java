/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Priklady;

/**
 *
 * @author Felix
 */

interface Prostredek{

    public String getNazev();
    public int getPocetKol();
    public int maVicKol(Prostredek jiny);


}

class Kolo implements Prostredek{

    private String nazev;
    private int pocetKol;

    public Kolo(){
        this.nazev = "Kolo";
        this.pocetKol = 2;
    }

    public String getNazev(){
        return this.nazev;
    }

    public int getPocetKol(){
        return this.pocetKol;
    }

    public int maVicKol(Prostredek jiny){
        if(this.getPocetKol() > jiny.getPocetKol()){
            return 1;
        }else{
            return 0;
        }
    }
}


class Auto implements Prostredek{

    private String nazev;
    private int pocetKol;

    public Auto(){
        this.nazev = "Auto";
        this.pocetKol = 4;
    }

    public String getNazev(){
        return this.nazev;
    }

    public int getPocetKol(){
        return this.pocetKol;
    }

    public int maVicKol(Prostredek jiny){
        if(this.getPocetKol() > jiny.getPocetKol()){
            return 1;
        }else{
            return 0;
        }
    }
}


public class Rozhrani2 {
    public static void main(String[] args) {
        Prostredek kolo = new Kolo();
        Prostredek auto = new Auto();

        Kolo kolo2 = new Kolo();

        System.out.println(kolo.getNazev());
        System.out.println(auto.getNazev());
        System.out.println(kolo.maVicKol(auto));
        System.out.println(kolo2.maVicKol(auto));
    }
}
