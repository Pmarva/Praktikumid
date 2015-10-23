package praktikum8;

import lib.TextIO;

import java.util.ArrayList;

/**
 * Created by Marva on 23.10.2015.
 */
public class InimesteMassiiv {
    public static void main(String[] args) {
        ArrayList<Inimene> inimesed = new ArrayList<Inimene>();
        System.out.println("Palju inimesi tahad sisestada");
        int numOfPeaople = TextIO.getInt();

        for (int i = 0; i <numOfPeaople ; i++) {
            System.out.println("Sisesta nimi:");
            String nimi = TextIO.getWord();
            System.out.println("Sisesta vanus:");
            int vanus = TextIO.getInt();

            inimesed.add(new Inimene(nimi,vanus));
        }

        for (Inimene i:inimesed) {
            System.out.println(i);
        }
    }
}
