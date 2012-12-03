package sachy;

/**
 *
 * @author Felix
 */
public class Dama extends Figurka{


    public Dama(int rowId, int colId) {
        super("Dama", "D", rowId, colId);
    }

    public int[][] attacks(){

        int pos[][] = new int[48][];
        int x = -1;
        for(int a=0;a<8;a++){
            pos[++x] = new int[]{this.getRowId()+a,this.getColId()+a};
        }
        for(int a=0;a<8;a++){
            pos[++x] = new int[]{this.getRowId()-a,this.getColId()+a};
        }
        for(int a=0;a<8;a++){
            pos[++x] = new int[]{this.getRowId()+a,this.getColId()-a};
        }
        for(int a=0;a<8;a++){
            pos[++x] = new int[]{this.getRowId()-a,this.getColId()-a};
        }

        for(int a=0;a<8;a++){
            pos[++x] = new int[]{this.getRowId(),a};
            pos[++x] = new int[]{a,this.getColId()};

        }

        return pos;


    }

}
