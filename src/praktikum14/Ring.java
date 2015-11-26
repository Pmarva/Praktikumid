package praktikum14;

/**
 * Created by Marva on 26.11.2015.
 */
public class Ring {
    Punkt keskPunkt;
    int raadius;

    public Ring(Punkt keskPunkt, int raadius) {
        this.keskPunkt=keskPunkt;
        this.raadius=raadius;
    }

    public double ymberMoot() {
        return 2*Math.PI*raadius;
    }

    public double pindala(){
            return Math.PI*Math.pow(raadius,2);
    }

}
