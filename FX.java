/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadfx;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Student
 */
public class Main extends Application {
    Button btnFirst;
    Button btnSecond;
    Label labelFirst;
    Label labelSecond;
    FlowPane pane1;
    FlowPane pane2;
    Scene scene1;
    Scene scene2;
    Stage myStage;
    
    
    @Override
    public void start(Stage primaryStage) {
        myStage = primaryStage;
        btnFirst = new Button();
        btnFirst.setText("Go to second");
        
        btnSecond = new Button();
        btnSecond.setText("Back");
        String s = "text";
        
        btnFirst.setOnAction(e ->ButtonClickedT(e));
        btnSecond.setOnAction(e ->ButtonClickedT(e));
        
        btnFirst.setId("button1");
                
        
        //btnFirst.setStyle("-fx-background-color:indigo; -fx-text-fill:white;");
        
        
        labelFirst = new Label("Not begin");
        labelSecond = new Label("Not begin");
        
        pane1 = new FlowPane();
        pane2 = new FlowPane();
        
        pane1.setId("paneFirst");
        pane2.setId("paneSecond");
        
        //pane1.setStyle("-fx-background-color:tan; -fx-padding:10px;");
        //pane1.setStyle("-fx-background-color:red; -fx-padding:10px;");
                
        
        pane1.getChildren().add(btnFirst);
        pane1.getChildren().add(labelFirst);
        pane2.getChildren().add(btnSecond);
        pane2.getChildren().add(labelSecond);
        
        scene1 = new Scene(pane1, 500, 200);
        scene2 = new Scene(pane2, 500, 200);
        scene1.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());
        
        myStage.setTitle("View switch");
        myStage.setScene(scene1);
        myStage.show();
    }
    
    private void ButtonClickedT(ActionEvent e) {
        
        if(e.getSource() == btnFirst) {
            labelFirst.setText("loaded...");
            /*
            Runnable myRunnable = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(5000);
                            System.out.println("Finish of thread");
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
            };
            
            ExecutorService execService = Executors.newFixedThreadPool(1);
            execService.execute(myRunnable);
            myStage.setScene(scene2);
            while (!execService.isTerminated()) {
            }
            */
            myStage.setScene(scene2);
            labelSecond.setText("end of runnable");
            
        } else {
            myStage.setScene(scene1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
