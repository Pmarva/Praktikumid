package praktikum8;

import lib.TextIO;

/**
 * Created by Marva on 23.10.2015.
 */
public class T2htedeAsendaja {
    public static void main(String[] args) {

        System.out.println("Sisesta t2ht millega tahad asendada koik t2ish22likud");
        char asendus = TextIO.getChar();

            String laul = "Põdral maja metsa sees,\n" +
                    "Väiksest aknast välja vaatab.\n" +
                    "Jänes jookseb kõigest väest,\n" +
                    "lävel seisma jääb.\n" +
                    "\n" +
                    "Kop-kop lahti tee!\n" +
                    "Metsas kuri jahimees!\n" +
                    "Jänes tuppa tule sa,\n" +
                    "anna käppa ka!\n" +
                    "\n" +
                    "Kop-kop lahti tee!\n" +
                    "Metsas kuri jahimees!\n" +
                    "Jänes tuppa tule sa,\n" +
                    "anna käppa ka!";

            //StringBuilder buffer = new StringBuilder(laul);
            char[] toReplace = {'a','e','i','o','u','u','ü','ä','õ','ö'};

            for (char t2ht :toReplace) {
                laul=laul.replace(t2ht,asendus);
            }
        System.out.println("T2ish22likud asendati t2hega"+asendus);
        System.out.println(laul);
    }
}
