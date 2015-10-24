package praktikum8;

import org.apache.commons.codec.digest.DigestUtils;
import java.security.MessageDigest;

/**
 * Created by Marva on 23.10.2015.
 */
public class PasswordFromMD5Hash {
    public static void main(String[] args) {

        //result k4la
        String md5Hash = "fd21ae5b17d8a85257936fc23c78ca5c";
        String test = "k4la";
        outerLoop:
        for(char a = 'a'; a <= 'z';a++) {
            for(char b = '1'; b<='9';b++) {
                for(char c = 'a'; c <= 'z';c++) {
                    for(char d = 'a'; d <= 'z';d++) {
                        StringBuffer parool = new StringBuffer();
                        parool.insert(0,a).insert(1,b).insert(2,c).insert(3,d);
                        String paroola=parool.toString();
                        String hash = DigestUtils.md5Hex(paroola);
                        System.out.println(paroola);

                        if(hash.equals(md5Hash)) {
                            System.out.println("Success!!!!");
                            System.out.println(paroola);

                            break outerLoop;
                        }
                    }
                }
            }
        }
    }
}
