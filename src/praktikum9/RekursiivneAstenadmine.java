package praktikum9;

/**
 * Created by Marva on 30.10.2015.
 */
public class RekursiivneAstenadmine {
    public static void main(String[] args) {
        System.out.println(astenda(2, 3));
    }

    public static int astenda(int number,int pow) {
        if(pow==0) {
            return number;
        } else if(pow==1) {
            return number;
        } else {
            int vastus = number*number;
            return astenda(vastus,pow-1);
        }
    }
}
