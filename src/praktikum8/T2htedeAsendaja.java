package praktikum8;

import lib.TextIO;

/**
 * Created by Marva on 23.10.2015.
 */
public class T2htedeAsendaja {
    public static void main(String[] args) {

        System.out.println("Sisesta t2ht millega tahad asendada koik t2ish22likud");
        char asendus = TextIO.getChar();

            String laul = "P�dral maja metsa sees,\n" +
                    "V�iksest aknast v�lja vaatab.\n" +
                    "J�nes jookseb k�igest v�est,\n" +
                    "l�vel seisma j��b.\n" +
                    "\n" +
                    "Kop-kop lahti tee!\n" +
                    "Metsas kuri jahimees!\n" +
                    "J�nes tuppa tule sa,\n" +
                    "anna k�ppa ka!\n" +
                    "\n" +
                    "Kop-kop lahti tee!\n" +
                    "Metsas kuri jahimees!\n" +
                    "J�nes tuppa tule sa,\n" +
                    "anna k�ppa ka!";

            //StringBuilder buffer = new StringBuilder(laul);
            char[] toReplace = {'a','e','i','o','u','u','�','�','�','�'};

            for (char t2ht :toReplace) {
                laul=laul.replace(t2ht,asendus);
            }
        System.out.println("T2ish22likud asendati t2hega"+asendus);
        System.out.println(laul);
    }
}
