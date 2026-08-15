package lk.ijse.sams.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CourseViewController {

    @FXML
    private Button courseClearBtn;

    @FXML
    private TableColumn<?, ?> courseCodeClm;

    @FXML
    private TextField courseCodeTxtFld;

    @FXML
    private Button courseDeleteBtn;

    @FXML
    private TableColumn<?, ?> courseDescClm;

    @FXML
    private TextArea courseDescTxtFld;

    @FXML
    private TableColumn<?, ?> courseIDClm;

    @FXML
    private AnchorPane courseMangement;

    @FXML
    private TableColumn<?, ?> courseNameClm;

    @FXML
    private TextField courseNameTxtFld;

    @FXML
    private Button courseSaveBtn;

    @FXML
    private Button courseSearchBtn;

    @FXML
    private TextField courseSearchTxtFld;

    @FXML
    private TableColumn<?, ?> courseSubjectClm;

    @FXML
    private TableView<?> courseTbl;

    @FXML
    private Button courseUpdateBtn;

    @FXML
    void onClickCourseClearBtn(ActionEvent event) {

    }

    @FXML
    void onClickCourseDeleteBtn(ActionEvent event) {

    }

    @FXML
    void onClickCourseSaveBtn(ActionEvent event) {

    }

    @FXML
    void onClickCourseSearchBtn(ActionEvent event) {

    }

    @FXML
    void onClickCourseUpdateBtn(ActionEvent event) {

    }

}
