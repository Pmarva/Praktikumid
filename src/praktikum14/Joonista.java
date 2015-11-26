package praktikum14;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by Marva on 26.11.2015.
 */
public class Joonista extends Application {
    Scene scene;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Group root = new Group();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        joonistaRing(new Ring(new Punkt(100, 100), 50), gc);
        joonistaJoon(new Punkt(0,0),new Punkt(400,400),gc);
        joonistaPunkt(new Punkt(200,200),gc);

        Punkt p1 = new Punkt(0,400);
        Punkt p2 = new Punkt(100,100);
        Punkt p3 = new Punkt(50,200);
        Punkt p4 = new Punkt(400,400);
        ArrayList<Punkt> punktid = new ArrayList<>();
        punktid.add(p1);
        punktid.add(p2);
        punktid.add(p3);
        punktid.add(p4);

        yhendaJoontega(punktid,gc);
        root.getChildren().addAll(canvas);
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    public void joonistaRing(Ring r, GraphicsContext gc) {
        int keskkohtX = r.keskPunkt.xKordinaat;
        int keskkohtY = r.keskPunkt.yKordinaat;
        int raadius = r.raadius;

        for (double nurk = 0; nurk <= Math.PI * 2; nurk = nurk + .03) {
            int x = (int) (raadius * Math.cos(nurk));
            int y = (int) (raadius * Math.sin(nurk));
            gc.fillRect(keskkohtX + x, keskkohtY + y, 2, 2);
        }
    }

    public void joonistaJoon(Punkt p1,Punkt p2,GraphicsContext gc) {
        gc.setLineWidth(5.0);
        gc.strokeLine(p1.xKordinaat,p1.yKordinaat,p2.xKordinaat,p2.yKordinaat);

    }

    public void joonistaPunkt(Punkt p,GraphicsContext gc) {
        joonistaJoon(p,p,gc);
    }

    public void yhendaJoontega(ArrayList<Punkt> punktid,GraphicsContext gc) {
        int pikkus = punktid.size();
        Punkt algus;
        Punkt lopp;
        int j;


        for(int i=0; i<pikkus-1;i++) {
            j=i;
            if(i==pikkus) {
                lopp=punktid.get(j);
                algus=punktid.get(--j);


            } else {
                algus=punktid.get(j);
                lopp=punktid.get(++j);
            }
          joonistaJoon(algus,lopp,gc);
        }
    }
}
