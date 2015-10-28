package harjutamiseks;

/**
 * Created by Marva on 28.10.2015.
 */
public class VeeruSumma {
    public static void main(String[] args) {
                int[][] massiiv= {
                        {4,5,6},
                        {4,5,6,7,8,10},
                        {4,5,5},
                        {1,2,5}
                };
       // System.out.println(massiiv.length);
        int[] summad = sumofColumfColumn(massiiv);
        for (int summa:summad) {
            System.out.println(summa);
        }
    }

    public static int[] sumofColumfColumn(int[][] maassiiv) {
        int[] columSums = new int[maxLenghtofRow(maassiiv)];

        for (int i=0; i<maassiiv.length;i++) {
            for (int j = 0; j <maassiiv[i].length ; j++) {
                columSums[j]+=maassiiv[i][j];
            }
        }
        return columSums;
    }

    public static int maxLenghtofRow(int[][] matrix) {
        int maxLength=Integer.MIN_VALUE;
        for (int[] row:matrix) {

            if(row.length>maxLength) {
                maxLength=row.length;
            }
        }
        return maxLength;
    }




}
