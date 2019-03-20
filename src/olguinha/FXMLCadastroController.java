/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olguinha;

import database.InsertDB;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
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
    private TextField txtTel;
    @FXML
    private TextField txtTelegram;
    @FXML
    private TextField txtEndereco;
    @FXML
    private TextField txtObs;
    @FXML
    private Label lblSalvo;
    @FXML
    private Button btnSalvar;
    @FXML
    private CheckBox cbSexoMasculino;
    @FXML
    private CheckBox cbSexoFeminino;
    @FXML
    private CheckBox cbSexoOutro;
    @FXML
    private DatePicker dpNasc;
    
    String sexo;

                                
    /**
     * Initializes the controller class.
     */
    @FXML
    private void clicouSalvar(ActionEvent event) {
        System.out.println();
        if (txtNome.getText().isEmpty() || txtCpf.getText().isEmpty() || sexo.isEmpty()) {
            lblSalvo.setText("Os campos Nome, CPF e Sexo \n são obrigatorios");
            lblSalvo.setVisible(true);
        }
        else {
        InsertDB app = new database.InsertDB();
        app.insert(txtNome.getText(), txtCpf.getText(), sexo, txtTel.getText(), dpNasc.getValue().toString(), txtTelegram.getText(), txtEndereco.getText(), txtObs.getText());
        
        txtNome.setText(null);
        txtCpf.setText(null);
        cbSexoFeminino.setSelected(false);
        cbSexoMasculino.setSelected(false);
        cbSexoOutro.setSelected(false);
        txtTel.setText(null);
        dpNasc.setValue(null);
        txtTelegram.setText(null);
        txtEndereco.setText(null);
        txtObs.setText(null);
        lblSalvo.setVisible(true);
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ClicouSexoMasculino(ActionEvent event) {
        cbSexoFeminino.setSelected(false);
        cbSexoOutro.setSelected(false);
        sexo="M";
    }

    @FXML
    private void clicouSexoFeminino(ActionEvent event) {
        cbSexoMasculino.setSelected(false);
        cbSexoOutro.setSelected(false);
        sexo="F";
    }

    @FXML
    private void clicouSexoOutro(ActionEvent event) {
        cbSexoMasculino.setSelected(false);
        cbSexoFeminino.setSelected(false);
        sexo="O";
    }
    
}
