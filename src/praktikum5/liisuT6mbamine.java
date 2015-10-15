package praktikum5;

import lib.TextIO;

/**
 * Created by mmartins on 2.10.15.
 */
public class liisuT6mbamine {

    public static void main(String[] args) {
        System.out.println("Sisesta inimeste arv");
        int inimesteArv = TextIO.getInt();
        System.out.println("Õnnelik inimene on: " + randomLiisk(inimesteArv));
    }

    public static int randomLiisk(int inimArv){
        int random = (int)(Math.random()*Math.abs(inimArv));

        return random;
    }
}
