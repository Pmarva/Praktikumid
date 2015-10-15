package praktikum6;

import highlow.TextIO;

/**
 * Created by Marva on 11.10.2015.
 */
public class ArvudVastupidi {
    public static void main(String[] args) {
        int NumberOfNUmbers=10;
        double[] numbrid = new double[NumberOfNUmbers];

        for (int i = 0; i < NumberOfNUmbers; i++) {
            System.out.println("Sisesta "+(i+1)+".arv");
            double arv = TextIO.getDouble();
            numbrid[i]= arv;
        }
        for (int i = NumberOfNUmbers-1; i > -1 ; i--) {
            System.out.print(numbrid[i]+" ");
        }
    }
}
