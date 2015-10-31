package praktikum9;

/**
 * Created by Marva on 30.10.2015.
 */
public class RekursiivneAstenadmine {
    public static void main(String[] args) {
        System.out.println(astenda(2,5));
    }

    public static int astenda(int number,int pow) {
        if(pow==0) {
            return 1;
        } else if(pow==1) {
            return number;
        } else {
            return number*astenda(number,pow-1);
        }
    }
}
