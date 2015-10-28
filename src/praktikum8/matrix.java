package praktikum8;

import meetodid.Meetodid;

/**
 * Created by Marva on 24.10.2015.
 */
public class matrix {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(10,10);

        for (int[] rida:matrix){
            for (int arv:rida){
                System.out.printf("%d\t", arv);
            }
            System.out.printf("\n");
        }
        int difference = maxAndMinDifference(matrix);
        System.out.println("Erinevus: "+difference);
        int[] maxMedRow = maxMedianRow(matrix);
        for (int number:maxMedRow) {
            System.out.printf("%d\t", number);
        }

    }

    public static int[][] generateMatrix(int width, int heigth) {
        int[][] maatrix = new int[width][heigth];

        for (int i=0; i<heigth;i++){
            for (int j=0; j<width; j++) {
                maatrix[i][j]= Meetodid.suvalineArv(100);
            }
        }
        return maatrix;
    }

    public static int[] maxMedianRow(int[][] matrix) {
        int maxArv=Integer.MIN_VALUE;
        int[] maxMedRow={};
        int pikkus = matrix.length;
        if(pikkus%2==0){
            for(int[] rida:matrix){
                int mediaan=(rida[(pikkus/2)-1]+rida[(pikkus/2)])/2;
                if(mediaan>maxArv){
                    maxArv=mediaan;
                    maxMedRow=rida;
                }
            }
        } else {
            for (int[] rida : matrix) {
                int mediaan = rida[(pikkus/2)];
                if (mediaan > maxArv) {
                    maxArv = mediaan;
                    maxMedRow = rida;
                }
            }
        }
        return maxMedRow;
    }

    public static int maxAndMinDifference(int[][] matrix) {
        int maxNumber = Meetodid.getMatrixMax(matrix);
        int minNumber = Meetodid.getMatrixMin(matrix);
        System.out.println("Max: "+maxNumber);
        System.out.println("Min: "+minNumber);
        return maxNumber-minNumber;
    }
}
