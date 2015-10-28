package praktikum7.taibudele;

import lib.TextIO;

/**
 * Created by Marva on 16.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        getSportlased(2);

        int sortValik=1;

        do {
            System.out.println("Sorteerimine:");
            System.out.println("1. Nime");
            System.out.println("2. Esimese tulemuse");
            System.out.println("3. Teise tulemuse");
            System.out.println("4. Tulemuste summa");
            sortValik = TextIO.getInt();
        }while(sortValik<1 || sortValik>4);

        int sortJrk = 1;
        do {
            System.out.println("Sorteerimise j2rjekord:");
            System.out.println("1. Kasvavas");
            System.out.println("2. Kahaneevas");
            sortJrk = TextIO.getInt();
        }while(sortJrk<1 || sortJrk>2);



    }

    public static void getSportlased(int pikkus) {
        System.out.println("Sisesta "+pikkus+". sportlase nimed ja tulemused.");
        for (int i = 0; i < pikkus; i++) {

            System.out.println("Sisesta " + (i + 1) + " sportlase nimi");
            String nimi = TextIO.getWord();
            System.out.println("Sisesta " + (i + 1) + " sportlase esimene tulemus");
            double tulemus1 = TextIO.getDouble();
            System.out.println("Sisesta " + (i + 1) + " sportlase teine tulemus");
            double tulemus2 = TextIO.getDouble();

            OsalejateAndmebaas.lisaSportlane(nimi,tulemus1,tulemus2);
        }
    }
}
