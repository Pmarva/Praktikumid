package praktikum8;

/**
 * Created by Marva on 23.10.2015.
 */
public class Inimene {
    private String nimi;
    private  int vanus;

    public Inimene(String nimi, int vanus) {
        this.nimi = nimi;
        this.vanus=vanus;
    }
    @Override
    public String toString() {
        return "Isik: "+this.nimi+" vanus:"+this.vanus;
    }
}
