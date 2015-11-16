package loputoo;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Marva on 09.11.2015.
 */
public class Server {

    private ArrayList<ChatRoom> chatRooms = new ArrayList<ChatRoom>();

    public static void main(String[] args) throws Exception {
            ServerSocket serverSocket = new ServerSocket(12900, 100, InetAddress.getByName("Localhost"));
            System.out.println("Server started at:" + serverSocket);

        while(true) {
            System.out.println("Waiting for connection ...");
            Socket activeSocket = serverSocket.accept();
            Runnable runnable = () -> clientCommunication(activeSocket);
            new Thread(runnable).start(); // start a new thread
        }
    }


    private static void clientCommunication(Socket activeSocket){
        try {
            User kasutaja;
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(activeSocket.getInputStream()));
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(activeSocket.getOutputStream()));

            socketWriter.write("Sisestage kasutajanimi:");
            socketWriter.newLine();
            socketWriter.flush();

            String nimi=socketReader.readLine();
            kasutaja = new User(nimi);
            socketWriter.write("Tere: "+kasutaja.toString());
            socketWriter.newLine();
            socketWriter.flush();
            //System.out.println("Yhendus " + activeSocket);
            //socketWriter.write("Tere, siia võite midagi kirjutada...");
            //socketWriter.newLine();
            //socketWriter.flush();

            String teade = null;

            while((teade = socketReader.readLine()) != null) {
                if (teade.equals("exit")) {
                    break;
                }
                //socketWriter.write(teade);
                //socketWriter.newLine();
                //socketWriter.flush();
                System.out.println("Message from "+kasutaja+": "+teade);
            }

            socketWriter.close();
            activeSocket.close();
        }catch (Exception e) {
            System.out.println("test");
            e.printStackTrace();
        }
    }

    public void showChatRooms() {
        for (ChatRoom room:chatRooms) {
            System.out.println(room);
        }
    }
}

