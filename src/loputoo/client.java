package loputoo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
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
        launch(args); //koige algus, mis k2ivitab start meetodi.
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
        BorderPane bp = new BorderPane();
        Button sendButtpon = new Button("Send message");
        TextField sisestus = new TextField();
        sisestus.setPrefWidth(500.0);
        HBox hbox = new HBox();
        hbox.getChildren().addAll(sisestus,sendButtpon);
        bp.setBottom(hbox);

        scene = new Scene(bp,600,600);
        window.setScene(scene);
        window.setTitle("AwsomeJavaChat 0.01");
        window.show();
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
