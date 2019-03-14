/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olguinha;

import database.InsertDB;
import database.SelectApp;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author lmleo
 */
public class FXMLCadastroController implements Initializable {
   
    /**
     * Initializes the controller class.
     */
    @FXML
    private void clicouSalvar(ActionEvent event) {
        InsertDB app = new database.InsertDB();
        app.insert("Raw Materials", 3000);
        app.insert("Semifinished Goods", 4000);
        app.insert("Finished Goods", 5000);
        SelectApp app2 = new SelectApp();
        app2.selectAll();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
