package praktikum5;

/**
 * Created by mmartins on 2.10.15.
 */
public class T2ringuM2ng {
    public static void main(String[] args) throws InterruptedException {

        int arvutiPunktid=0;
        int kasutajaPunktid=0;

        for(int i=0; i<3; i++) {
            arvutiPunktid+=t2ring();
            Thread.sleep(2000);
            kasutajaPunktid+=t2ring();
        }

        if(arvutiPunktid>kasutajaPunktid) {
            System.out.println("Arvuti võitis");
            System.out.println("Arvuti punktid: "+arvutiPunktid+" Kasutaja punktid:  "+kasutajaPunktid);
        } else {
            System.out.println("Kasutaja võitis");
            System.out.println("Arvuti punktid: "+arvutiPunktid+" Kasutaja punktid:  "+kasutajaPunktid);
        }
    }

    public static int t2ring() {
        return (int)(Math.random()*6)+1;
    }

}

