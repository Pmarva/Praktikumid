package praktikum8;

import java.security.MessageDigest;
import org.apache.commons.codec.digest;

/**
 * Created by Marva on 23.10.2015.
 */
public class PasswordFromMD5Hash {
    public static void main(String[] args) {

        //result k4la
        String md5Hash = "fd21ae5b17d8a85257936fc23c78ca5c";
        String test = "k4la";
    try{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(test.getBytes());
        byte[] diggest = md.digest();
        StringBuffer sb = new StringBuffer();
        DigestUtils test Digest

    }catch (Exception e) {

    }





    }
}
