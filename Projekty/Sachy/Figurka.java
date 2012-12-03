package sachy;

/**
 *
 * @author Felix
 * dedi: kral, dama, vez, kun, strelec
 */
abstract class Figurka implements Kolize{
    public String name;
    public char tag;
    public int rowId;
    public int colId;

    public Figurka(String name){
        this.name = name;
    }

    public Figurka(String name, char tag){
        this.name = name;
        this.tag = tag;
    }

    public Figurka(int rowId, int colId){
        this.rowId = rowId;
        this.colId = colId;
    }

    public Figurka(String name, String tag, int rowId, int colId){
        this.name = name;
        this.tag = tag.toUpperCase().charAt(0);
        this.rowId = rowId;
        this.colId = colId;
    }

    public String getName(){
        return this.name;
    }

    public int getRowId(){
        return this.rowId;
    }

    public int getColId(){
        return this.colId;
    }

    public char getTag(){
        return this.tag;
    }

    public int[][] getAttacks(){
        return this.attacks();
    }

    public void vypisInfo() {
        //System.out.println("Jmeno: "+this.name);
        //System.out.println("Znacka: "+this.tag);
        //System.out.println("Radek : "+this.rowId);
        //System.out.println("Sloupec: "+this.colId);
        //System.out.println("Sach.zapis: "+this.tag+" "+Tools.toAlphabet(this.rowId)+this.colId);
    }


    public int kolize(Kolize figurka){
        int hit = 0;
        Figurka figura = (Figurka)figurka;
        for(int x[]:this.getAttacks()){
            if(figura.getRowId() == x[0] && figura.getColId() == x[1]){
                hit++;
                System.out.println(this.getTag()+" "+Tools.toAlphabet(this.getColId())+(8-this.getRowId())+" ohrozuje "
                        +figura.getTag()+" "+Tools.toAlphabet(figura.getColId())+(8-figura.getRowId()));
            }
        }
        return hit;
    }

}
