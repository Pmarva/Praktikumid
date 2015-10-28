package meetodid;

import java.util.Random;

/**
 * Created by Marva on 11.10.2015.
 */
public class Meetodid {
    public static Random rand = new Random();
    public static int suvalineArv(int max) {
        return rand.nextInt(max);
    }
    public static int[][] generateMatrix(int width, int heigth) {
        int[][] maatrix = new int[width][heigth];

        for (int i=0; i<heigth;i++){
            for (int j=0; j<width; j++) {
                maatrix[i][j]= Meetodid.suvalineArv(101);
            }
        }
        return maatrix;
    }

    public static int getMatrixMax(int[] massiiv) {
        int maxNumber=Integer.MIN_VALUE;
        for(int arv: massiiv) {
            if(arv>maxNumber) {
                maxNumber=arv;
            }
        }
        return maxNumber;
    }

    public static int getMatrixMax(int[][] massiiv) {
        int maxNumber=Integer.MIN_VALUE;
        int buffer=0;
        for(int[] rida: massiiv) {
            buffer=getMatrixMax(rida);
            if(buffer>maxNumber) {
                maxNumber=buffer;
            }
        }
        return maxNumber;
    }

    public static int getMatrixMin(int[] massiiv) {
        int minNumber=Integer.MAX_VALUE;
        for(int arv: massiiv) {
            if(arv<minNumber) {
                minNumber=arv;
            }
        }
        return minNumber;
    }

    public static int getMatrixMin(int[][] massiiv) {
        int minNumber=Integer.MAX_VALUE;
        int buffer=0;
        for(int[] rida: massiiv) {
            buffer=getMatrixMin(rida);
            if(buffer<minNumber) {
                minNumber=buffer;
            }
        }
        return minNumber;
    }



}
