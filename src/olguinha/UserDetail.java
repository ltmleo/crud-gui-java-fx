/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olguinha;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lmleo
 */
public class UserDetail {

    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty cpf;
    private final StringProperty sexo;
    private final StringProperty tel;
    private final StringProperty nasc;
    private final StringProperty telegram;
    private final StringProperty endereco;
    private final StringProperty obs;

    public UserDetail(Integer id, String name, String cpf, String sexo, String tel, String nasc, String telegram, String endereco, String obs) {
        this.id = new SimpleStringProperty(id.toString());
        this.name = new SimpleStringProperty(name);
        this.cpf = new SimpleStringProperty(cpf);
        this.sexo = new SimpleStringProperty(sexo);
        this.tel = new SimpleStringProperty(tel);
        this.nasc = new SimpleStringProperty(nasc);
        this.telegram = new SimpleStringProperty(telegram);
        this.endereco = new SimpleStringProperty(endereco);
        this.obs = new SimpleStringProperty(obs);

    }

    //getters
    public String getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public String getCpf() {
        return cpf.get();
    }

    public String getSexo() {
        return sexo.get();
    }

    public String getTel() {
        return tel.get();
    }

    public String getNasc() {
        return nasc.get();
    }

    public String getTelegram() {
        return telegram.get();
    }

    public String getEndereco() {
        return endereco.get();
    }

    public String getObs() {
        return obs.get();
    }

    //setters
    
    public void setId(String value) {
        id.set(value);
    }

    public void setName(String value) {
        name.set(value);
    }

    public void setCpf(String value) {
        cpf.set(value);
    }

    public void setSexo(String value) {
        sexo.set(value);
    }

    public void setNasc(String value) {
        nasc.set(value);
    }

    public void setTelegram(String value) {
        telegram.set(value);
    }

    public void setEndereco(String value) {
        endereco.set(value);
    }

    public void setObs(String value) {
        obs.set(value);
    }
    
    //property values
    
    public StringProperty idProperty() {
        return id;
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty cpfProperty() {
        return cpf;
    }

    public StringProperty sexoProperty() {
        return sexo;
    }

    public StringProperty nascProperty() {
        return nasc;
    }

    public StringProperty telegramProperty() {
        return telegram;
    }

    public StringProperty enderecoProperty() {
        return endereco;
    }

    public StringProperty obsProperty() {
        return obs;
    }
    
    
}
