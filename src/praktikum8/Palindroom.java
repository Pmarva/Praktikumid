package praktikum8;

import lib.TextIO;

/**
 * Created by Marva on 23.10.2015.
 */
public class Palindroom {
    public static void main(String[] args) {
        System.out.println("Sisesta sõna kontrollime selle palindroomi");
        System.out.println("V2ljumiseks kirjuta quit");
            String sona="null";
        while(!sona.equals("quit")) {
            sona = TextIO.getWord();
            StringBuilder buffer = new StringBuilder(sona);
            String teineSona = buffer.reverse().toString();

            if (sona.equals(teineSona)) {
                System.out.println("Sõnad on võrdesed");
            } else {
                System.out.println("Ei ole v6rdsed");
            }
        }

    }
}
