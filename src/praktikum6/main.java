package praktikum6;

import highlow.TextIO;
import meetodid.Meetodid;

import java.util.Random;

/**
 * Created by Marva on 11.10.2015.
 */
public class main {
    public static void main(String[] args) {
        int kasitajaArva=0;
        int arvutiArv=Meetodid.suvalineArv(100);

        while(true) {
            System.out.println("Arva number �ra?");
            int kasutajaArv= TextIO.getInt();
            if(arvutiArv==kasutajaArv) {
                System.out.println("�ige arv");
                break;
            } else if(arvutiArv<kasutajaArv) {
                System.out.println("�rv on v�iksem");
            } else {
                System.out.println("arv on suurem");
            }
        }
    }
}
