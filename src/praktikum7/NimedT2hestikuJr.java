package praktikum7;

import lib.TextIO;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Marva on 16.10.2015.
 */
public class NimedT2hestikuJr {
    public static void main(String[] args) {
        String sisend;
        ArrayList<String> nimed = new ArrayList<String>();
        System.out.println("Sisesta nimesid niiplaju kui tahad, kui ei taha enam sisesta siis sisesta tyhi rida ja olemasolevad nimed sorteeritakse ja v2ljastatakse.");
        while(true) {
            System.out.println("Sisesta nimi: ");
            sisend = TextIO.getlnString().replaceAll("\\s+", "");

            if (!sisend.isEmpty()) {
                nimed.add(sisend);
            } else {
                break;
            }
        }
        Collections.sort(nimed);

        for(String nimi: nimed) {
            System.out.println(nimi);
        }

    }
}
