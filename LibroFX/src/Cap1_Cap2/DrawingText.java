/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cap1_Cap2;

import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author saficdoc
 */
public class DrawingText extends Application {

@Override
public void start(Stage primaryStage) {
primaryStage.setTitle("Chapter 2 Drawing Text");
Group root = new Group();
Scene scene = new Scene(root, 300, 250, Color.WHITE);
Random rand = new Random(System.currentTimeMillis());
for (int i = 0; i < 100; i++) {
int x = rand.nextInt((int) scene.getWidth());
int y = rand.nextInt((int) scene.getHeight());
int red = rand.nextInt(255);
int green = rand.nextInt(255);
int blue = rand.nextInt(255);

Text text = new Text(x, y, "JavaFX 8");
 
int rot = rand.nextInt(360);
text.setFill(Color.rgb(red, green, blue, .99));
text.setRotate(rot);
root.getChildren().add(text);
}
 
primaryStage.setScene(scene);
primaryStage.show();
}

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

    