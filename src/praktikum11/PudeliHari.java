package praktikum11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Created by Marva on 12.11.2015.
 */
public class PudeliHari extends Application {

    Stage window;
    Scene scene;
    int width=400;
    int height=400;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hari");
        Group root = new Group();
        Canvas canvas = new Canvas(width,height);
        canvas.autosize();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);

        int x0 = width/2; // Keskpunkt
        int y0 = height/2;
        int r = 100; // Raadius
        int x, y;
        double t;

        for (t = -Math.PI; t < Math.PI; t = t + Math.PI / 16) {
            x = (int) (r * Math.cos(t) + x0);
            y = (int) (r * Math.sin(t) + y0);
            gc.strokeLine(x0, y0, x, y);
        }

        root.getChildren().add(canvas);
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    private void joonista(GraphicsContext gc) {

    }
}
