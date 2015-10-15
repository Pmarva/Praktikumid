package praktikum6;

import highlow.TextIO;
import meetodid.Meetodid;

/**
 * Created by Marva on 11.10.2015.
 */
public class PnustegaT2ringuM2ng {
    public static void main(String[] args) {
        double kasutajaRaha=100;

        while(kasutajaRaha>0) {

            System.out.println("Ennsuta t2ringu number 1-6.");
            int kasutajaT2ringuValik= TextIO.getInt();
            System.out.println("Sisesta raha summa 0-"+kasutajaRaha);
            double kasutajaPanus = TextIO.getDouble();
            int t2ring = Meetodid.suvalineArv(6);

            if(t2ring==kasutajaT2ringuValik) {
                kasutajaRaha+=kasutajaPanus*6;
            } else {
                kasutajaRaha-=kasutajaPanus;
            }
            System.out.println("Raha on alles: "+kasutajaRaha);
        }

        System.out.println("Raha sai otsa");
    }
}
