package praktikum8;

import lib.TextIO;

/**
 * Created by Marva on 23.10.2015.
 */
public class SonaSuurteT2htedega {
    public static void main(String[] args) {
        String sona = TextIO.getWord();
        StringBuilder buffer = new StringBuilder();
        sona=sona.toUpperCase();
        char[] massiiv = sona.toCharArray();

        for (char c:massiiv) {
            buffer.append(c);
            buffer.append("-");
        }
        buffer.deleteCharAt(buffer.length()-1);
        System.out.println(buffer.toString());

    }
}
