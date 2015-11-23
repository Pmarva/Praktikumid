package loputoo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.jfr.events.SocketReadEvent;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Created by Marva on 09.11.2015.
 */
public class Client extends Application {
    public static BufferedReader socketReader;
    Scene scene;
    Stage window;

    public static void main(String[] args) {

        try {
            String lineSeperator = System.getProperty("line.separator");
            Socket socket = new Socket("localhost", 12900);
            System.out.println("Connected to:" + socket);
            socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String outMsg = null;
            Runnable runnable = () -> getFromServer();
            new Thread(runnable).start();

            while((outMsg = consoleReader.readLine()) != null) {
                socketWriter.write(outMsg);
                socketWriter.write(lineSeperator);
                socketWriter.flush();
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

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
    }

    public static void getFromServer(){
        String inMsg = null;

        try {
            while(true) {
                inMsg = socketReader.readLine();
                if(inMsg.equals("null")){
                    break;
                }
                System.out.println(inMsg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
