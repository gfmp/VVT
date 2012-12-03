package miny;

/**
 *
 * @author Felix
 */
public class Miny {

    int[][] pole;

    public void generuj(int velikost) {
        pole = new int[velikost][velikost];
    }

    public void vypis() {
        System.out.println("----------");
        for (int i = 0; i < pole.length; i++) {
            for (int y = 0; y < pole[i].length; y++) {
                System.out.print(pole[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    public void nahodne(int pocetMin) {
        int radek;
        int sloupec;
        while (pocetMin > 0) {
            radek = (int) (Math.random() * pole.length);
            sloupec = (int) (Math.random() * pole.length);
            if (pole[radek][sloupec] == 0) {
                pole[radek][sloupec] = 1;
                pocetMin--;
            }
        }
    }

    public boolean volno(int radek, int sloupec) {
        if (pole[radek][sloupec] == 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Miny m = new Miny();
        // vytvori pole 10x10
        m.generuj(10);
        // nasazi nahodne 20 min
        m.nahodne(20);
        // vypise hraci plochu
        m.vypis();
        
        // nase tahy
        /*
         * delsi verze
         * 
        boolean volno = m.volno(0, 0);
        if(volno) {
            System.out.println("[0,0] je volno");
        } else {
            System.out.println("[0,0] je mina");
        }
        */
        
        /*
         * kratsi verze
         */
        System.out.println("[0,0] je " + (m.volno(0, 0) ? "volno" : "mina"));
        System.out.println("[5,2] je " + (m.volno(5, 2) ? "volno" : "mina"));
        System.out.println("[3,3] je " + (m.volno(3, 3) ? "volno" : "mina"));
        System.out.println("[6,8] je " + (m.volno(6, 8) ? "volno" : "mina"));
        System.out.println("[9,8] je " + (m.volno(9, 8) ? "volno" : "mina"));
    }
}
