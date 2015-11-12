package praktikum10;

/**
 * Created by Marva on 06.11.2015.
 */
public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <10000 ; i++) {
            System.out.println(fibonacci(i));
        }

    }

    public static int fibonacci(int n) {
        if(n==0) {
            return 0;
        } else if(n==1) {
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
