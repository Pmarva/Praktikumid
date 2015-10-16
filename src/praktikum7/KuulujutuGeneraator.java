package praktikum7;
import meetodid.Meetodid;

import java.util.Arrays;
/**
 * Created by Marva on 16.10.2015.
 */
public class KuulujutuGeneraator {
    public static void main(String[] args) {

        String[] meheNimed= {"Kalle","Juku","Madis","Tarvo","Taivo"};
        String[] naiseNimed= {"Malle","Juta","Mari","Mai","Maie"};
        String[] teguSonad={"jooksid","elasid","magasid","jalutasid","l6hkusid"};

        String suvalineMeheNimi=meheNimed[Meetodid.suvalineArv(meheNimed.length)];
        String suvalineNaiseNimi=naiseNimed[Meetodid.suvalineArv(naiseNimed.length)];
        String suvalineTegevus=teguSonad[Meetodid.suvalineArv(teguSonad.length)];

        System.out.println(suvalineMeheNimi+" ja "+suvalineNaiseNimi+" "+suvalineTegevus+" metsas");
    }
}
