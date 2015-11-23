package praktikum13;

import meetodid.Meetodid;

import java.util.ArrayList;

/**
 * Created by Marva on 20.11.2015.
 */
public class Keskmine {
    public static void main(String[] args) {
        String fail = "numbrid.txt";
        ArrayList<String> sisuTekst;
        String filePath = Keskmine.class.getResource(".").getPath()+fail;
        sisuTekst=FailiLugeja.loeFaili(filePath);
        double aritmeetilineKeskmine= Meetodid.aritmethicAverage(sisuTekst);
        System.out.println(aritmeetilineKeskmine);
    }
}
