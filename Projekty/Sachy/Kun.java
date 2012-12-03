package sachy;

/**
 *
 * @author Felix
 */
public class Kun extends Figurka{

    public Kun(int rowId, int colId) {
        super("Kun","J", rowId, colId);
    }

    public int[][] attacks(){

        int pos[][] = new int[8][];
        pos[0] = new int[]{this.getRowId()+2,this.getColId()-1};
        pos[1] = new int[]{this.getRowId()+2,this.getColId()+1};
        pos[2] = new int[]{this.getRowId()+1,this.getColId()-2};
        pos[3] = new int[]{this.getRowId()+1,this.getColId()+2};
        pos[4] = new int[]{this.getRowId()-1,this.getColId()-1};
        pos[5] = new int[]{this.getRowId()-1,this.getColId()+2};
        pos[6] = new int[]{this.getRowId()-2,this.getColId()-1};
        pos[7] = new int[]{this.getRowId()-2,this.getColId()+1};

        return pos;

    }

}
