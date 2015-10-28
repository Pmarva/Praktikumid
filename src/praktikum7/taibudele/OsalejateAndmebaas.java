package praktikum7.taibudele;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Marva on 16.10.2015.
 */
public class OsalejateAndmebaas {
    private static ArrayList<Sportlane> sportlased = new ArrayList<>();

    public static void lisaSportlane(String nimi, double tulemus1, double tulemus2) {
        Sportlane ajutine = new Sportlane(nimi,tulemus1,tulemus2);
        sportlased.add(ajutine);
    }

    public static int numberOf() {
        return sportlased.size();
    }

    public static void sortByName() {
    }
}
