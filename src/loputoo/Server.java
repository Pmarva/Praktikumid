package loputoo;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Marva on 09.11.2015.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12900,100, InetAddress.getByName("Localhost"));
            System.out.println("Server started at:" + serverSocket);
            System.out.println("Waiting for connection ...");
            Socket activeSocket=serverSocket.accept();
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(activeSocket.getInputStream()));
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(activeSocket.getOutputStream()));
            socketWriter.flush();

            socketWriter.write("Tere, siia võite midagi kirjutada...");

            String teade = null;

            while((teade=socketReader.readLine())!=null) {
                if(teade.equals("exit")) {
                    break;
                }
                //socketWriter.write(teade);
                //socketWriter.newLine();
                //socketWriter.flush();
               System.out.println("Message from client:"+teade);
            }

            activeSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Tekkis viga:" +e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
