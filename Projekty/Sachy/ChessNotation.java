package sachy;

/**
 *
 * @author Felix
 */
public class ChessNotation {
    public int[] positions = new int[2];
    
    public ChessNotation(String note){
        positions[0] = Integer.parseInt( Character.toString(note.charAt(1)) );
        positions[1] = Tools.fromAlphabet(note.charAt(0));
    }

    public int[] getPositions(){
        return positions;
    }

    public void setRowId(int rowId){
        this.positions[0] = rowId;
    }
    
    public void setColId(int colId){
        this.positions[1] = colId;
    }

    public int getRowId(){
        return 8-this.positions[0];
    }

    public int getColId(){
        return this.positions[1];
    }
}
