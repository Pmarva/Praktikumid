package praktikum6;

import lib.TextIO;
import meetodid.Meetodid;

/**
 * Created by Marva on 11.10.2015.
 */
public class main {
    public static void main(String[] args) {
        int kasitajaArva=0;
        int arvutiArv=Meetodid.suvalineArv(100);

        while(true) {
            System.out.println("Arva number ära?");
            int kasutajaArv= TextIO.getInt();
            if(arvutiArv==kasutajaArv) {
                System.out.println("õige arv");
                break;
            } else if(arvutiArv<kasutajaArv) {
                System.out.println("Ärv on väiksem");
            } else {
                System.out.println("arv on suurem");
            }
        }
    }
}
