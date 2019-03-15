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
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author lmleo
 */
public class FXMLPesquisaController implements Initializable {

    @FXML
    private TableView tableResults;
    

    
    @FXML
    private void clicouPesquisarTodos(ActionEvent event) {
    SelectApp app2 = new SelectApp();
    app2.selectAll();    
    tableResults.setItems(app2.selectAllToTable());
     tableResults.getColumns().addAll(app2.selectAllToTable());


   //tabela.setItems((ObservableList);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
