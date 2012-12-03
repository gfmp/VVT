package sachy;

/**
 *
 * @author Felix
 */
interface Kolize{
    /*
     * Vraci 1 - pri kolizi
     * 0 - pri nekolizi
     */
    public int kolize(Kolize figurka);

    public int[][] attacks();

}
