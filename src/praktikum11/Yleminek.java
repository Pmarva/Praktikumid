package praktikum11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.applet.Applet;

/**
 * Created by Marva on 13.11.2015.
 */
public class Yleminek extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Rectangle rc = new Rectangle(400,400,v2rvi(Color.BLACK,Color.WHITE));
        Group root = new Group();
        root.getChildren().add(rc);
        Scene scene = new Scene(root,400,400);
        window.setScene(scene);
        window.show();
    }

    public LinearGradient v2rvi(Color a, Color b) {
        Stop[] stops = new Stop[] { new Stop(0, a), new Stop(1, b)};
        LinearGradient lg = new LinearGradient(0,0,400,400,false, CycleMethod.NO_CYCLE,stops);
        return lg;
    }
}
