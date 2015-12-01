package loputoo;

import java.io.*;
import java.net.*;
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
            Thread t = new Thread(runnable);
            t.setDaemon(true);
            t.start();
        }
    }

    public static void clientCommunication(Socket activeSocket) {
        try {
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(activeSocket.getInputStream()));
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(activeSocket.getOutputStream()));
            User kasutaja = new User("GUEST",socketWriter);
//             socketWriter.write("Sisestage kasutajanimi:");
//            socketWriter.newLine();
//            socketWriter.flush();

//            String nimi = socketReader.readLine();

            //socketWriter.write("Tere: " + kasutaja.toString());
            //socketWriter.newLine();
            //socketWriter.flush();
            String teade = null;
            String[] content = null;
            String message;

            while ((teade = socketReader.readLine()) != null) {
                    content = getPrefix(teade);
                if (content[0].equals("NICK")) {
                        kasutaja = new User(content[1],socketWriter);
                        clients.add(kasutaja);
                        //String message = ":"+kasutaja+" MODE "+kasutaja+" :+i";
                        //System.out.println(message);
                        //kasutaja.sendMessage(message);
                        message = ":127.0.0.1 001 "+kasutaja+" :Welcome to the fancy java IRC server chat";
                        System.out.println(message);
                        kasutaja.sendMessage(message);
                } else if(content[0].equals("PING")) {
                    String s = "PONG :"+content[1];
                    kasutaja.sendMessage(s);
                } else if(teade.equals("JOIN")) {
                    
                } else if(teade.equals("join")) {

                }

               // String message = "Message from " + kasutaja + ": " + teade;
                //sendMessage(message, kasutaja);
                System.out.println(teade);
            }
            activeSocket.close();
        }catch (SocketException e) {
            System.out.println("Klient lahkus");
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

    public static String[] getPrefix(String input) {
        CharSequence cs = " :";
        String[] s;
        if(input.contains(cs)) {
            s = input.split(" \\:");
        } else {
            s = input.split(" ");
        }
        return s;
    }
}

