package praktikum13;

import meetodid.Meetodid;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Marva on 20.11.2015.
 */
public class FailiLugeja {
    public static void main(String[] args) {
        String fail = "kala.txt";
        ArrayList<String> sisuTekst;
        String filePath = FailiLugeja.class.getResource(".").getPath()+fail;
        sisuTekst=loeFaili(filePath);
        sisuTekst=sorteeri(sisuTekst);
        for (String kala:sisuTekst) {
            System.out.println(kala);
        }
    }

    public static ArrayList loeFaili(String filePath) {

        File file = new File(filePath);
        ArrayList sisu = new ArrayList();

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String rida;


            while ((rida = in.readLine()) != null) {
                sisu.add(rida);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sisu;
    }

    public static ArrayList<String> sorteeri(ArrayList<String> sisu) {
        Collections.sort(sisu);
        return sisu;
    }
}
