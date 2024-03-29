/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olguinha;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ltmleo
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnCadastrar;
    @FXML
    private Button btnPesquisar;
    @FXML
    private Button btnMenssagem;
    @FXML
    private Label test;
    public void abreJanela(String arquivoFXML){
        try {
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(arquivoFXML));
           Parent root1 = (Parent) fxmlLoader.load();
           Stage stage = new Stage();
           stage.setScene(new Scene(root1));  
           stage.show();
           } catch(Exception e) {
               e.printStackTrace();
           }
    }
    
    @FXML
    private void clicouCadastrar(ActionEvent event) {
        abreJanela("FXMLCadastro.fxml");
    }
    @FXML
    private void clicouPesquisar(ActionEvent event) {
        abreJanela("FXMLPesquisa.fxml");
    }
    @FXML
    private void clicouAgendar(ActionEvent event) {
        abreJanela("FXMLAgendar.fxml");
    }
    
    @FXML
    private void clicouMenssagem(ActionEvent event) {
        System.out.println("Em Desenvolvimento");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}