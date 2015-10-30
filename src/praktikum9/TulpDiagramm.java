package praktikum9;

import lib.TextIO;

import java.util.ArrayList;

/**
 * Created by Marva on 30.10.2015.
 */
public class TulpDiagramm {
    public static void main(String[] args) {
        ArrayList<Integer> numbrid = new ArrayList<Integer>();
        System.out.println("Sisesta numbrid, 0 katkestatakse 2ra");
        Integer number=1;
        while (!number.equals(0)) {
            number = Math.abs(TextIO.getInt());
            if(!number.equals(0)) {
                numbrid.add(number);
            }
        }
        tulpDiagramm(numbrid);
    }

    public static void tulpDiagramm(ArrayList<Integer> m) {

        int suurim=Integer.MIN_VALUE;
        double kons = 1.0;

        for (Integer arv:m) {
           if(arv>suurim) {
               suurim=arv;
           }
        }
        if(suurim>80) {
          kons = Math.ceil((double)suurim/80.0);
        }

        for (Integer arv:m) {
            if(arv>80) {
                arv=arv/(int)kons;
            }
            System.out.printf("%-3d",arv);
            for (int i=0; i<arv; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
