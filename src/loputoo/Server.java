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

    public static ArrayList<ChatRoom> chatRooms = new ArrayList<ChatRoom>();
    public static ArrayList<User> clients = new ArrayList<User>();


    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(12900, 100, InetAddress.getByName("Localhost"));
        System.out.println("Server started at:" + serverSocket);

        while (true) {
            System.out.println("Waiting for connection ...");
            Socket activeSocket = serverSocket.accept();
            Runnable runnable = () -> clientCommunication(activeSocket);
            new Thread(runnable).start();
        }
    }

    public static void clientCommunication(Socket activeSocket) {
        try {
            User kasutaja;
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(activeSocket.getInputStream()));
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(activeSocket.getOutputStream()));
            socketWriter.write("Sisestage kasutajanimi:");
            socketWriter.newLine();
            socketWriter.flush();

            String nimi = socketReader.readLine();
            kasutaja = new User(nimi,socketWriter);
            clients.add(kasutaja);
            socketWriter.write("Tere: " + kasutaja.toString());
            socketWriter.newLine();
            socketWriter.flush();
            String teade = null;

            while ((teade = socketReader.readLine()) != null) {

                if (teade.equals("exit")) {
                    clients.remove(kasutaja);
                    break;
                } else if(teade.equals("newRoom")) {
                    newChatRoom("Testikas",kasutaja);
                } else if(teade.equals("showRooms")) {
                    showChatRooms();
                } else if(teade.equals("join")) {

                }

                String message = "Message from " + kasutaja + ": " + teade;
                sendMessage(message, kasutaja);
                System.out.println(message);

            }
            activeSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showChatRooms() {
        for (ChatRoom room : chatRooms) {
            System.out.println(room);
        }
    }

    public static void sendMessage(String message, User client) {

        for (User s : clients) {
            if (s != client) {
                s.sendMessage(message);
            }
        }
    }

    public static void newChatRoom(String name, User u) {
        ChatRoom cr = new ChatRoom(name,u);
        chatRooms.add(cr);
    }

    public static void joinChatRoom(String chatroomName,User u) {

        for (ChatRoom cr:chatRooms) {
            if(cr.toString().equals(chatroomName)) {
                cr.join(u);
                String teade = u+"connected";
            }
        }
    }
}

