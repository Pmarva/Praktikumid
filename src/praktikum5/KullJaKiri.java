package praktikum5;

import lib.TextIO;

/**
 * Created by mmartins on 2.10.15.
 */
public class KullJaKiri {
    public static void main(String[] args) {
        System.out.println("Kull või kiri?");
        System.out.println("0. kull");
        System.out.println("1. kii");
        int valik = TextIO.getInt();
        System.out.println(kullV6iKiri(valik));
    }

    public static String kullV6iKiri(int v) {
        int vastus = (int)(Math.random() * 2);
        if(v==vastus) {
            return "arvasite õigesti";
        } else {
            return "midagi läks nihu";
        }

    }
}
