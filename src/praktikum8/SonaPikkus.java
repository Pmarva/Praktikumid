package praktikum8;

import lib.TextIO;

import java.util.ArrayList;

/**
 * Created by Marva on 23.10.2015.
 */
public class SonaPikkus {
    public static void main(String[] args) {
        ArrayList<String> sonad = new ArrayList();

        System.out.println("Sisesta kümme sõna");
        for (int i = 0; i <10 ; i++) {
            sonad.add(TextIO.getlnWord());
        }

        for (String sona: sonad) {
            System.out.println("Pikkus:"+sona.length()+" Sona ise: "+sona);
        }

    }
}
