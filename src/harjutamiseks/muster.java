package harjutamiseks;

/**
 * Created by Marva on 28.10.2015.
 */
public class muster {
    public static void main(String[] args) {
            int[][] maatriks = muster(5);
        for (int[] rida:maatriks){
            for (int koht:rida) {
                System.out.printf("%d\t",koht);
            }
            System.out.println();
        }
    }

    public static int[][] muster(int n) {
        int[][] maatriks = new int[n][n];

        for (int rida=0;rida<n;rida++){
            for (int veerg=0;veerg<n;veerg++) {
                maatriks[rida][veerg]=(int)Math.pow(rida+veerg,2);
            }
        }
        return maatriks;
    }
}
