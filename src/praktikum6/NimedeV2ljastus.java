package praktikum6;

import lib.TextIO;
import meetodid.Meetodid;

/**
 * Created by Marva on 11.10.2015.
 */
public class NimedeV2ljastus {

    public static void main(String[] args) {
        System.out.println("Mitu nime sisestad?");
        int nimedeArv = TextIO.getInt();
        String[] nimed = new String[nimedeArv];
        for(int i=0; i<nimedeArv; i++) {
            System.out.println("Sisesta "+(i+1)+". nimi");
            String buffer= TextIO.getWord();
            nimed[i]=buffer;
        }

        System.out.println(nimed[Meetodid.suvalineArv(nimedeArv)]);
    }
}
