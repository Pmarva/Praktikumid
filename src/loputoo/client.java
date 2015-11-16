package loputoo;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Created by Marva on 09.11.2015.
 */
public class Client {
    public static void main(String[] args) {
        try {

            String lineSeperator = System.getProperty("line.separator");

            Socket socket = new Socket("localhost", 12900);
            System.out.println("Connected to:" + socket);
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String outMsg = null;

            while((outMsg = consoleReader.readLine()) != null) {
                socketWriter.write(outMsg);
                socketWriter.write(lineSeperator);
                socketWriter.flush();
                String inMsg = socketReader.readLine();
                System.out.println("Server: " + inMsg);
                if (inMsg == null) {
                    System.out.println("Connection closed");
                    break;
                }
            }
            socket.close();
        } catch(ConnectException e) {
            System.out.println("Server ei vasta");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Errrrror");
            System.out.println(e);
        }
    }
}
