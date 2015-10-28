package harjutamiseks;

import java.util.Arrays;

/**
 * Created by Marva on 28.10.2015.
 */
public class Massiiv {
    public static void main(String[] args) {
        int[] massiiv = {3, 6, 2, 8, 4 };
        System.out.println("Katsete tulemused");
        for (int tulemus:massiiv){
            System.out.print(tulemus+" ");
        }
        System.out.println("Tulemus: "+score(massiiv));
    }

    public static int score(int[] massiiv){
        int [] tulemused = massiiv;
        Arrays.sort(tulemused);
        int summa=0;

       for (int tulemus:tulemused){
           summa+=tulemus;
       }
        // Lahutame maha kaks koige v2iksemat tulemust..
        summa-=tulemused[0];
        summa-=tulemused[1];

        return summa;
    }
}
