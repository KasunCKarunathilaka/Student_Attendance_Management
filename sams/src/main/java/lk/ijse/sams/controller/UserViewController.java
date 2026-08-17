package lk.ijse.sams.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UserViewController {

    @FXML
    private TextField passwordUMgtTxtFld;

    @FXML
    private ComboBox<?> roleUMgtCmbBox;

    @FXML
    private TextField searchUMgtTxtFld;

    @FXML
    private Button userClearBtn;

    @FXML
    private Button userDeleteBtn;

    @FXML
    private TableColumn<?, ?> userIDClm;

    @FXML
    private TableView<?> userManagementTbl;

    @FXML
    private TableColumn<?, ?> userNameClm;

    @FXML
    private TextField userNameUMgtTxtFld;

    @FXML
    private TableColumn<?, ?> userPasswordClm;

    @FXML
    private TableColumn<?, ?> userRoleClm;

    @FXML
    private Button userSaveBtn;

    @FXML
    private Button userSearchBtn;

    @FXML
    private Button userUpdateBtn;

    @FXML
    void onClickUserClearBtn(ActionEvent event) {

    }

    @FXML
    void onClickUserDeleteBtn(ActionEvent event) {

    }

    @FXML
    void onClickUserSaveBtn(ActionEvent event) {

    }

    @FXML
    void onClickUserSearchBtn(ActionEvent event) {

    }

    @FXML
    void onClickUserUpdateBtn(ActionEvent event) {

    }

}
