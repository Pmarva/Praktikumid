package praktikum6;

/**
 * Created by Marva on 11.10.2015.
 */
public class MassiiviElementideSumma {

    public static int summa(int[] massiiv) {
        int sum=0;
        for (int i = 0; i < massiiv.length; i++) {
            sum+=massiiv[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int summa = summa(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(summa);
    }
}
