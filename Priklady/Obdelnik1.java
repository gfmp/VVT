/*
 * Priklad: Třída Obdelnik
 */


package Priklady;

/**
 *
 * @author Felix
 */

class Obdelnik2 {
    private int horniRohX=50;
    private int horniRohY=50;
    private int delka;
    private int sirka;

    public Obdelnik2(){
        this.delka = 100;
        this.sirka = 100;
    }

    public Obdelnik2(int delka) {
        this.delka = delka;
        this.sirka = delka;
    }

    public Obdelnik2(int delka, int sirka) {
        this.delka = delka;
        this.sirka = sirka;
    }

    public int getDelka() {
        return delka;
    }

    public int getSirka() {
        return sirka;
    }

    public void setDelka(int delka) {
        this.delka = delka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public static void main(String[] args) {

    }
}
