package praktikum5;

/**
 * Created by mmartins on 2.10.15.
 */
public class ViisT2ringuViset {
    public static void main(String[] args) throws InterruptedException {
        int summa=0;

        for(int i=0;i<6;i++) {
            Thread.sleep(500);
            summa+=T2ring();
        }
        System.out.println("Summa on "+summa);
    }

    public static int T2ring() {
        int b = (int)(Math.random()*6)+1;
        System.out.println(b);
        return b;
    }
}
