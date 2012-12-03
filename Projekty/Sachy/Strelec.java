package sachy;

/**
 *
 * @author Felix
 */
public class Strelec extends Figurka{

    public Strelec(int rowId, int colId) {
       super("Strelec", "S", rowId, colId);
    }

    public int[][] attacks(){

        int pos[][] = new int[32][];
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
        return pos;

    }

}
