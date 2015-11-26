package praktikum14;

/**
 * Created by Marva on 26.11.2015.
 */
public class Joon {
    Punkt algusPunkt;
    Punkt loppPunkt;


    public Joon(Punkt algusKordinaat, Punkt loppKordinaat) {
        this.algusPunkt=algusKordinaat;
        this.loppPunkt=loppKordinaat;
    }

    public double pikkus() {
        double x =  Math.pow(loppPunkt.xKordinaat-algusPunkt.xKordinaat,2);
        double y =  Math.pow(loppPunkt.yKordinaat-algusPunkt.yKordinaat,2);
        return Math.sqrt(x+y);
    }

    @Override
    public String toString() {
           return "Alguspunkti kordinaat:"+algusPunkt.toString() + "Lopppunkti kordinaat";
    }
}
