package praktikum14;

/**
 * Created by Marva on 26.11.2015.
 */
public class Silinder extends Ring {

    int korgus;

    public Silinder(Ring r,int korgus) {
        super(r.keskPunkt,r.raadius);
        this.korgus=korgus;
    }

    public double ruumala() {
        return super.pindala()*korgus;
    }

    @Override
    public double pindala() {
        return ymberMoot()*(raadius+korgus);
    }

}
