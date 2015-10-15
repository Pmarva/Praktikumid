package praktikum5;

import highlow.TextIO;

/**
 * Created by mmartins on 2.10.15.
 */
public class KasutajaSisestus {
    public static void main(String[] args) {
        kasutajaSisestus(4,10);
    }

    public static int kasutajaSisestus(int min, int max) {
        int kasutajaSisend=0;

        System.out.println("Sisesta arva: ");
        kasutajaSisend= TextIO.getInt();

        while(kasutajaSisend<min || kasutajaSisend>max) {
            System.out.println("Sisesta arva: ");
            kasutajaSisend= TextIO.getInt();
        }
        System.out.println("arv on vahemikus");
        return kasutajaSisend;

    }
}
