package sachy;

/**
 *
 * @author Felix
 */
public class Vez extends Figurka{

    public Vez(int rowId, int colId) {
       super("Vez", "V", rowId, colId);
    }

    public int[][] attacks(){

        int pos[][] = new int[16][];
        for(int a=0,x=-1;a<8;a++){
            pos[++x] = new int[]{this.getRowId(),a};
            pos[++x] = new int[]{a,this.getColId()};

        }

        return pos;

    }
}
