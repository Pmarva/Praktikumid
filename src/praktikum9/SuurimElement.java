package praktikum9;

import java.util.Arrays;

/**
 * Created by Marva on 30.10.2015.
 */
public class SuurimElement {
    public static void main(String[] args) {
        int[][] neo = {
                {1, 3, 6, 7},
                {2, 3, 3, 1},
                {17, 4, 5, 0},
                {-20, 13, 16, 17}
        };
        System.out.println(suurimElementKaheMootmeline(neo));
    }

    public static int suurimElementYheMootmeline(int[] massiiv) {
        Arrays.sort(massiiv);
        return massiiv[massiiv.length-1];
    }

    public static int suurimElementKaheMootmeline(int[][] massiiv) {
        int max = Integer.MIN_VALUE;

        for (int[] rida:massiiv) {
            int ajutine = suurimElementYheMootmeline(rida);
            if(ajutine>max) {
                max=ajutine;
            }
        }
        return max;
    }
}
