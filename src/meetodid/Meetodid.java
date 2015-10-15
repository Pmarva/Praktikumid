package meetodid;

import java.util.Random;

/**
 * Created by Marva on 11.10.2015.
 */
public class Meetodid {
  public static int suvalineArv(int max) {
      Random rand = new Random();
      return rand.nextInt(max);
  }
}
