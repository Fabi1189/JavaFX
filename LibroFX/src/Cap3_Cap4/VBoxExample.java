/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cap3_Cap4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author saficdoc
 */
public class VBoxExample extends Application {

    @Override
    public void start(Stage primaryStage){
        
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
        VBox vbox = new VBox(5);
        vbox.setPadding(new Insets(1));
        
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(20, 20);
        Rectangle r3 = new Rectangle(5, 20);
        Rectangle r4 = new Rectangle(20, 5);
        
        VBox.setMargin(r1, new Insets(2,2,2,2));
        
        vbox.getChildren().addAll(r1,r2,r3,r4);
        
        root.getChildren().add(vbox);
        primaryStage.setOnShown((WindowEvent we) ->{
        System.out.println("vbox width" + vbox.getBoundsInParent().getWidth());
        System.out.println("vbox height" + vbox.getBoundsInParent().getHeight());
        });
        primaryStage.setTitle("VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String [] args){
        launch(args);
    }
    
}
