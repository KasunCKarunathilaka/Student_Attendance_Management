package lk.ijse.sams.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class StudentViewController {

    @FXML
    private TableColumn<?, ?> studentAddressClm;

    @FXML
    private TextField studentAddressTxtFld;

    @FXML
    private Button studentClearBtn;

    @FXML
    private ComboBox<?> studentCourseCMBBox;

    @FXML
    private TableColumn<?, ?> studentCourseIDClm;

    @FXML
    private Button studentDeleteBtn;

    @FXML
    private TableColumn<?, ?> studentEmailClm;

    @FXML
    private TextField studentEmailTxtFld;

    @FXML
    private TableColumn<?, ?> studentFNameClm;

    @FXML
    private TextField studentFNameTxtFld;

    @FXML
    private TableColumn<?, ?> studentIDClm;

    @FXML
    private TableColumn<?, ?> studentLNameClm;

    @FXML
    private TextField studentLNameTxtFld;

    @FXML
    private AnchorPane studentManagement;

    @FXML
    private TableColumn<?, ?> studentPhoneClm;

    @FXML
    private TextField studentPhoneTxtFld;

    @FXML
    private TableColumn<?, ?> studentRegNOClm;

    @FXML
    private TextField studentRegNOTxtFld;

    @FXML
    private Button studentSaveBtn;

    @FXML
    private Button studentSearchBtn;

    @FXML
    private TextField studentSearchTxtFld;

    @FXML
    private TableView<?> studentTbl;

    @FXML
    private Button studentUpdateBtn;

    @FXML
    void onClickStudentClearBtn(ActionEvent event) {

    }

    @FXML
    void onClickStudentDeleteBtn(ActionEvent event) {

    }

    @FXML
    void onClickStudentSaveBtn(ActionEvent event) {

    }

    @FXML
    void onClickStudentSearchBtn(ActionEvent event) {

    }

    @FXML
    void onClickStudentUpdateBtn(ActionEvent event) {

    }

}
