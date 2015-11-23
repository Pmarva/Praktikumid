package praktikum13.kingaPood;

import lib.TextIO;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Marva on 20.11.2015.
 */
public class Kingapood {
    static ArrayList<Klient> kliendid= new ArrayList<>();
    static String file="Kliendid.data";

    public static void main(String[] args) {
        fileManager();
        readClients();
       while(true) {
           System.out.println("Mis soovid teha 1.)n2ita kliente 2)lisada uusi kliente 3)kustutda kliente.");
           int valik = TextIO.getInt();
           switch (valik) {
               case 1:
                   readClients();
                   break;
               case 2:
                   createClient();
                   break;
               case 3:
                   showClients();
                   System.out.println("Keda soovite kustutada?");
                   String nimi= TextIO.getWord();
                   deleteClient(nimi);
                   break;
               default:
                   System.out.println("Uus valik tee");
           }
       }
    }
    public static void showClients() {
        for (Klient k:kliendid) {
            System.out.println(k);
        }
    }
    public static void readClients() {
        FileInputStream f_in = null;

        try {
            f_in = new FileInputStream(file);
            ObjectInputStream obj_in = new ObjectInputStream (f_in);
            Object obj = obj_in.readObject();

            if(obj instanceof ArrayList) {
                kliendid=(ArrayList)obj;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public void deleteClient(String name) {
        if(kliendid.isEmpty()){
            readClients();
        } else {
            for (Klient k:kliendid){
                if(k.getName().equals(name)) {
                    kliendid.remove(k);
                }
            }
        }
        writeToFile();
    }

    static public void createClient() {

        System.out.println("Sisesta Kliendi nimi");
        String name =TextIO.getWord();
        System.out.println("Sisesta vanus");
        int vanus = TextIO.getInt();
        System.out.println("Sisesta kinganumber");
        int kingaNumber = TextIO.getInt();

        Klient k = new Klient(name, vanus, kingaNumber);

        kliendid.add(k);
        writeToFile();
    }

    static public void writeToFile() {
        try {
            FileOutputStream f_out = new FileOutputStream(file);
            ObjectOutputStream obj_out = new ObjectOutputStream (f_out);
            obj_out.writeObject(kliendid);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public void fileManager() {
        File f = new File(file);

        if(!f.exists()) {
            try {
                if(f.createNewFile()) {
                    System.out.println("Fail kirjutati..");
                } else {
                    System.out.println("Tekkis viga faili kirjutamisel");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
