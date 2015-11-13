package praktikum11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


/**
 * Created by Marva on 13.11.2015.
 */
public class Spiraal extends Application {
    Stage window;
    int width = 400;
    int height= 400;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        Group root = new Group();
        Canvas canvas = new Canvas(width,height);
        GraphicsContext gc=canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);

        int keskkohtX = width / 2;
        int keskkohtY = height / 2;
        double raadius = 1;

        for (double nurk = 0; nurk <= Math.PI * 6; nurk = nurk + .03) {
            raadius+=0.1;
            int x = (int) (raadius * Math.cos(nurk));
            int y = (int) (raadius * Math.sin(nurk));
            gc.fillRect(keskkohtX + x, keskkohtY + y, 2, 2);
        }

        root.getChildren().add(canvas);
        Scene scene = new Scene(root,width,height);
        window.setScene(scene);
        window.show();
    }
}
