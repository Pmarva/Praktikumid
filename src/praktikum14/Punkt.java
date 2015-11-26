package praktikum14;

/**
 * Created by Marva on 26.11.2015.
 */
public class Punkt {
    int xKordinaat;
    int yKordinaat;

    public Punkt(int xKordinaat, int yKordinaat) {
        this.xKordinaat=xKordinaat;
        this.yKordinaat=yKordinaat;
    }



    @Override
    public String toString() {
        return "X Kordinaat"+xKordinaat+"Y Kordinaat"+yKordinaat;
    }
}
