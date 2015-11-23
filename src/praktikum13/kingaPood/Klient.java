package praktikum13.kingaPood;

import java.io.Serializable;

/**
 * Created by Marva on 20.11.2015.
 */
public class Klient implements Serializable {
     private String nimi;
     private int vanus;
     private int kinganumber;

    public Klient(String nimi,int vanus, int kinganumber) {
        this.nimi=nimi;
        this.vanus=vanus;
        this.kinganumber=kinganumber;
    }

    public String toString() {
        return nimi;
    }

    public String getName() {
        return nimi;
    }
}
