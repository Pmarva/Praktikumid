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
        //tulpDiagrammHoriz(numbrid);
        tuldDiagrammVert(numbrid);
    }

    public static void tulpDiagrammHoriz(ArrayList<Integer> m) {

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

    public static void tuldDiagrammVert(ArrayList<Integer> m){
        int suurimElement=Integer.MIN_VALUE;

        for (Integer number:m) {
            if(number>suurimElement) {
                suurimElement=number;
            }
        }

        for (int i=suurimElement; i>0;i--){
            for (int j=0; j<m.size();j++){
                if(m.get(j)>=i && m.get(j)<=suurimElement) {
                    System.out.printf("%-2s","x");
                } else{
                    System.out.printf("%-2s"," ");
                }
            }
            System.out.println();
        }
        for (Integer arv:m){
            System.out.print("--");
        }

        System.out.println();
        for (Integer arv:m){
            System.out.printf("%-2d",arv);
        }
    }
}
