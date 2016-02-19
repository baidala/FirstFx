/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class FirstFX extends Application implements EventHandler<ActionEvent> {
    Label lable = new Label("Started.");
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btnSecond = new Button();
        
        btn.setText("Say 'Hello World'");
        btnSecond.setText("Second click");
        btnSecond.setOnAction( this);
        btn.setOnAction( this);
        btn.setId("btn");
        btnSecond.setId("btn1");
              
        //StackPane root = new StackPane();
        
        //root.getChildren().add(btn);
        
        HBox hPane = new HBox();
        hPane.getChildren().add(btn);
        hPane.getChildren().add(btnSecond);
        hPane.getChildren().add(lable);
        hPane.setPadding(new Insets(10));
        hPane.setAlignment(Pos.BASELINE_LEFT);
        hPane.setSpacing(20);
        Scene scene = new Scene(hPane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        switch ( ((Button) event.getSource()).getId() ) {
            case "btn":  lable.setText("Click btn");
                break;
                
            case "btn1": lable.setText("Click btn1");
                break;
            
        }
    }
    
}
