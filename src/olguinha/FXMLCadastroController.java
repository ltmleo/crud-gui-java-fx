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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lmleo
 */
public class FXMLCadastroController implements Initializable {
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtSexo;
    @FXML
    private TextField txtTel;
    @FXML
    private TextField txtNasc;
    @FXML
    private TextField txtTelegram;
    @FXML
    private TextField txtEndereco;
    @FXML
    private TextField txtObs;
    @FXML
    private Label lblSalvo;
                                
    /**
     * Initializes the controller class.
     */
    @FXML
    private void clicouSalvar(ActionEvent event) {
        InsertDB app = new database.InsertDB();
        app.insert(txtNome.getText(), txtCpf.getText(), txtSexo.getText(), txtTel.getText(), txtNasc.getText(), txtTelegram.getText(), txtEndereco.getText(), txtObs.getText());
        
        txtNome.setText(null);
        txtCpf.setText(null);
        txtSexo.setText(null);
        txtTel.setText(null);
        txtNasc.setText(null);
        txtTelegram.setText(null);
        txtEndereco.setText(null);
        txtObs.setText(null);
        lblSalvo.setVisible(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
