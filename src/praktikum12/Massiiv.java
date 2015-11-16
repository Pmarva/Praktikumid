package praktikum12;

import java.util.Arrays;

/**
 * Created by Marva on 14.11.2015.
 */
public class Massiiv extends Object {

    public static void print(int[] massiiv) {
        for (int arv : massiiv) {
            System.out.print(arv + " ");
        }
    }

    public static void print(int[][] massiiv) {
        for (int[] row : massiiv) {
            for (int arv : row) {
                System.out.print(arv + " ");
            }
            System.out.println();
        }
    }

    public static int[] sumOfRow(int[][] maatriks) {
        int[] sumofRows = new int[maatriks.length];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[i].length; j++) {
                sumofRows[i] += maatriks[i][j];
            }
        }
        return sumofRows;
    }

    public static int diagonalSum(int[][] maatriks) {
        int sum = 0;

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = maatriks[i].length - 1; j >= 0; j--) {
                sum += maatriks[i][j];
            }
        }
        return sum;
    }

    public static int[] maxOfRow(int[][] maatriks) {
        int max = Integer.MIN_VALUE;
        int[] maxOfRows = new int[maatriks.length];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[i].length; j++) {
                if (maatriks[i][j] > max) {
                    max = maatriks[i][j];
                }
            }
            maxOfRows[i] = max;
        }
        return maxOfRows;
    }

    public static int smallestElement(int[][] maatriks) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[i].length; j++) {
                if (maatriks[i][j] < min) {
                    min = maatriks[i][j];
                }
            }
        }
        return min;
    }

    public static int[][] moduleTwoMatrix(int rows, int columns) {
        rows = Math.abs(rows);
        columns = Math.abs(columns);

        int[][] maatriks = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                maatriks[i][j] = ((i + j) % 2);
            }
        }
        return maatriks;
    }

    public static int[][] transponeeri(int[][] maatriks) {

        // 1 2
        // 3 4
        // 5 6

        // 1 3 5
        // 2 4 6

        int[][] maatriks2 = new int[maatriks[0].length][maatriks.length];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[i].length; j++) {
                if (i == j) {
                    maatriks2[i][j] = maatriks[i][j];
                } else {
                    maatriks2[j][i] = maatriks[i][j];
                }
            }
        }
        return maatriks2;
    }
}
