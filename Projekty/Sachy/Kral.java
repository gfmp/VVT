package sachy;

/**
 *
 * @author Felix
 */
public class Kral extends Figurka{


    public Kral(int rowId, int colId) {
        super("Kral", "K", rowId, colId);
    }

    public int[][] attacks(){
        int pos[][] = new int[8][];
        pos[0] = new int[]{this.getRowId()+1,this.getColId()-1};
        pos[1] = new int[]{this.getRowId()+1,this.getColId()};
        pos[2] = new int[]{this.getRowId()+1,this.getColId()+1};
        pos[3] = new int[]{this.getRowId(),this.getColId()-1};
        pos[4] = new int[]{this.getRowId(),this.getColId()+1};
        pos[5] = new int[]{this.getRowId()-1,this.getColId()-1};
        pos[6] = new int[]{this.getRowId()-1,this.getColId()};
        pos[7] = new int[]{this.getRowId()-1,this.getColId()+1};
        return pos;
    }


}
