/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Student
 */
public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }
    
    @FXML public void handleButtonAction(ActionEvent e) {
        System.out.println("Click from FXML");
    }
}
