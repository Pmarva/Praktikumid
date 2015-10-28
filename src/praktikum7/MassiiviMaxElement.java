package praktikum7;

import java.lang.reflect.Array;

/**
 * Created by Marva on 16.10.2015.
 */
public class MassiiviMaxElement {
    public static void main(String[] args) {
            int[][] numbrid = {
                    {10,30,50},
                    {0,100,30,500}
            };
        System.out.println(maatrixMaksimum(numbrid));
    }

    public static int yheM66tmelinemaksimum(int[] massiiv) {
            int maxNumber=Integer.MIN_VALUE;
        for(int arv: massiiv) {
            if(arv>maxNumber) {
                maxNumber=arv;
            }
        }
        return maxNumber;
    }

    public static int maatrixMaksimum(int[][] massiiv) {
        int maxNumber=Integer.MIN_VALUE;
        int buffer=0;
        for(int[] arv: massiiv) {
            buffer=yheM66tmelinemaksimum(arv);
            if(buffer>maxNumber) {
                maxNumber=buffer;
            }
        }
        return maxNumber;
    }
}
