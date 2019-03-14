/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olguinha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import database.*;
/**
 *
 * @author lmleo
 */
public class Olguinha extends Application {
    public static final String URL = "jdbc:sqlite:./database/test.db";
    
    @Override    
    public void start(Stage stage) throws Exception {
               
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        database.CreateDB.createNewDatabase();
        database.DBConnection.connect();
        database.CreateTable.createNewTable();
        InsertDB app = new database.InsertDB();
        launch(args);

    }
    
}
