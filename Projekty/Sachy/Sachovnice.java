package sachy;

/**
 *
 * @author Felix
 */
public class Sachovnice {

    public Figurka[][] sachovnice;
    public Figurka[] figurky = new Figurka[32]; // 2 figurky
    public int posF = 0;

    public Sachovnice(){
        sachovnice = new Figurka[8][8];
    }

    public void vypis(){
        System.out.println("---------------------------------------");
        System.out.println("x  a  b  c  d  e  f  g  h");
        for(int r = 0;r<sachovnice.length;r++){
            System.out.print(8-r+" ");
            for(int c = 0;c<sachovnice.length;c++){
                /*
                switch(sachovnice[r][c]){
                    case 75:
                }
                 * 
                 */
                if(sachovnice[r][c] instanceof Figurka){
                    System.out.print(" "+sachovnice[r][c].getTag()+" ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");
    }

    public void addFigure(char type, int rowId, char colId){
        this.addFigure(type, rowId,  Tools.fromAlphabet(colId));
    }

    public void addFigure(char type, ChessNotation ch) {
        this.addFigure(type, ch.getRowId(), ch.getColId());
    }

    public void addFigure(char type, int rowId, int colId){
        try{
            if(this.isItFree(rowId, colId)){
                switch(type){
                    case 'K':
                        sachovnice[rowId][colId] = new Kral(rowId,colId);
                        break;
                    case 'D':
                        sachovnice[rowId][colId] = new Dama(rowId,colId);
                        break;
                    case 'V':
                        sachovnice[rowId][colId] = new Vez(rowId,colId);
                        break;
                    case 'S':
                        sachovnice[rowId][colId] = new Strelec(rowId,colId);
                        break;
                    case 'J':
                        sachovnice[rowId][colId] = new Kun(rowId,colId);
                        break;
                }
                figurky[this.posF] = sachovnice[rowId][colId];
                this.posF++;
            }else{
                System.out.println("Jedna figurka uz je na pozici [" + rowId+";"+colId+"]");
                System.exit(0);
            }

        }catch(Exception e){
            System.out.println("Vkladate pravdepodobne mimo rozsah sachovnice!");
            //System.out.println(e.getMessage());
        }
    }

    public boolean isItFree(int rowId, int colId){
        //System.out.println(sachovnice[rowId][colId]);
        if(sachovnice[rowId][colId] instanceof Figurka){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        Sachovnice s = new Sachovnice();
        /*
        s.addFigure('K', 1, 1);
        s.addFigure('D', 2, 'c');
        */


        s.addFigure('V', new ChessNotation("c2"));
        s.addFigure('V', new ChessNotation("a1"));
        s.vypis();
    }


}
