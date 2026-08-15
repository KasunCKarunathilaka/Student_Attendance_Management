package lk.ijse.sams.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LectureManagementViewController {

    @FXML
    private Button lectureClearBtn;

    @FXML
    private TextField lectureCodeTxtFld;

    @FXML
    private Button lectureDeleteBtn;

    @FXML
    private TableColumn<?, ?> lectureEmailClm;

    @FXML
    private TextField lectureEmailTxtFld;

    @FXML
    private TableColumn<?, ?> lectureIDClm;

    @FXML
    private AnchorPane lectureMAnagement;

    @FXML
    private TableColumn<?, ?> lectureNameClm;

    @FXML
    private TextField lectureNameTxtFld;

    @FXML
    private TableColumn<?, ?> lecturePhoneClm;

    @FXML
    private TextField lecturePhoneTxtFld;

    @FXML
    private Button lectureSaveBtn;

    @FXML
    private Button lectureSearchBtn;

    @FXML
    private TextField lectureSearchTxtFld;

    @FXML
    private TableColumn<?, ?> lectureSubjectClm;

    @FXML
    private ComboBox<?> lectureSubjectCmbBox;

    @FXML
    private TableView<?> lectureTbl;

    @FXML
    private Button lectureUpdateBtn;

    @FXML
    void onClickLectureClearBtn(ActionEvent event) {

    }

    @FXML
    void onClickLectureDeleteBtn(ActionEvent event) {

    }

    @FXML
    void onClickLectureSaveBtn(ActionEvent event) {

    }

    @FXML
    void onClickLectureSearchBtn(ActionEvent event) {

    }

    @FXML
    void onClickLectureUpdateBtn(ActionEvent event) {

    }

}
