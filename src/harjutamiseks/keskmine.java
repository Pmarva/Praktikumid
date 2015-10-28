package harjutamiseks;

import meetodid.Meetodid;

/**
 * Created by Marva on 28.10.2015.
 */
public class keskmine {
    public static void main(String[] args) {
        int[] maatriks = Meetodid.generateArray(10);
        for (int arv:maatriks) {
            System.out.printf("%d \t", arv);
        }
        System.out.println("yle keskmise:");
        System.out.println(numOverAverage(maatriks));

    }

    public static int getAverage(int[] massive) {
        int numOfElem = massive.length;
        int totalSum=0;

        for (int arv:massive) {
            totalSum+=arv;
        }

        return totalSum/numOfElem;
    }

    public static int numOverAverage(int[] massive) {
        int count=0;
        int average = getAverage(massive);
        for (int arv:massive) {
            if(arv>average) {
                count++;
            }
        }
        System.out.println("Keskmine: "+average);
        return count;
    }
}
