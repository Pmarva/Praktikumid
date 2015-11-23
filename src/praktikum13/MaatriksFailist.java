package praktikum13;

import java.util.ArrayList;

/**
 * Created by Marva on 20.11.2015.
 */
public class MaatriksFailist {
    public static void main(String[] args) {
        int[][] maatriks;

        String fail = "maatriks.txt";
        ArrayList<String> sisuTekst;
        String filePath = Keskmine.class.getResource(".").getPath()+fail;
        sisuTekst=FailiLugeja.loeFaili(filePath);
        maatriks = ArrayListToMatrix(sisuTekst);
        maatriks = transponeeri(maatriks);
        System.out.println("Esialgne");

        for (String rida:sisuTekst) {
            System.out.println(rida);
        }
        System.out.println("Peale transponeerimist!!");

        for (int[] row:maatriks) {
            for (int arv:row) {
                System.out.print(arv+" ");
            }
            System.out.println();
        }
    }

    public static int[][] ArrayListToMatrix(ArrayList<String> maatriks) {
        int pikkus = maatriks.get(0).split("\\s+").length;
        int[][] numbrid = new int[maatriks.size()][pikkus];
        for (int i = 0; i <maatriks.size() ; i++) {
            String[] number=maatriks.get(i).split("\\s+");
            for (int j = 0; j <pikkus ; j++) {
                    numbrid[i][j]=Integer.parseInt(number[j]);
            }
        }
        return numbrid;
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
