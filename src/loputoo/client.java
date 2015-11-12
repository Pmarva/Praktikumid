package loputoo;

import java.io.*;
import java.net.Socket;

/**
 * Created by Marva on 09.11.2015.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",12900);
            System.out.println("Connected to:" + socket);
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String outMsg=null;

            while((outMsg=consoleReader.readLine())!=null) {
                socketWriter.write(outMsg);
                socketWriter.write(System.getProperty("line.separator"));
                socketWriter.flush();

                String inMsg=socketReader.readLine();
                if(!inMsg.equals(null)) {
                    System.out.println("Server: " + inMsg);
                }
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Errrrror");
        }
    }
}
