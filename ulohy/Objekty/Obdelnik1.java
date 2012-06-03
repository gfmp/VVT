/*
 * 1. Doplňte do třídy Obdelník konstruktory umožňující nastavení polohy pravého horního rohu.
 * 2. Doplňte do třídy Obdelník metody pro změnu polohy pravého horního rohu.
 * 3. Doplňte do třídy Kreslítko další tlačítko pro změnu polohy obdélníku.
 * 4. Doplňte do třídy Kreslítko další instanci objektu Obdelnik
 * jednoduše řečeno zobrazte na plátně další obdélník) a doplňte další tlačítko
 * pro změnu polohy (nebo velikosti) tohoto dalšího obdélníku.
 * 5. Doplňte do třídy Obdelnik další atribut barva (deklarujte jej jako objekt typu Color).
 * Umožněte jeho nastavení pomocí konstruktorů a dále pomocí metody setBarva(). 
 * Dále doplňte možnost zjistit barvu objektu Obdelnik pomocí metody getBarva().
 * Nakonec doplňte do třídy Kreslitko tlačítko, které obdélník přebarví na červený.
 */


package Ulohy.Objekty;

/**
 *
 * @author Felix
 */
class Obdelnik1 {
  private int horniRohX=50;
  private int horniRohY=50;
  private int delka;
  private int sirka;

  public Obdelnik1() {
    this.delka = 100;
    this.sirka = 100;
  }

  public Obdelnik1(int delka) {
    this.delka = delka;
    this.sirka = delka;
  }

  public Obdelnik1(int delka, int sirka, int horniRohX) {
    this.delka = delka;
    this.sirka = sirka;
    this.horniRohX = horniRohX;
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

  public void setHorniRohX(int horniRohX) {
    this.horniRohX = horniRohX;
  }

}