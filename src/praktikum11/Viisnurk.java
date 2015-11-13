package praktikum11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by Marva on 13.11.2015.
 */
public class Viisnurk extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Canvas canvas = new Canvas(400,400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);

        int x0 = 150; // Keskpunkt
        int y0 = 150;
        int raadius = 100; // Raadius
        int sammudeArv = 5; // Nurkade arv
        int tiirudeArv = 2; // "Tiirude" arv
        double t0 = -Math.PI / 2; // Faas ehk kust alustada
        int x, y, eelmineX = 0, eelmineY = 0;
        double t;
        boolean esimene = true;

        // Joonistame

        for (t = 0; t <= 2 * tiirudeArv * Math.PI; t = t + 2 * tiirudeArv * Math.PI / sammudeArv) {
            x = (int) (raadius * Math.cos(t + t0) + x0);
            y = (int) (raadius * Math.sin(t + t0) + y0);
            if (esimene) {
                esimene = false;
            }
            else {
                gc.strokeLine(x, y, eelmineX, eelmineY);
            }
            eelmineX = x;
            eelmineY = y;
        }

        gc.strokeOval(x0-raadius,y0-raadius,raadius*2,raadius*2);

        Group root = new Group();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }
}
