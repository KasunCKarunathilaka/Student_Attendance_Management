package lk.ijse.sams.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ClassViewController {

    @FXML
    private ComboBox<?> classCourseCmbBox;

    @FXML
    private DatePicker classDatePicker;

    @FXML
    private TableColumn<?, ?> classEndTimeClm;

    @FXML
    private TextField classEndTimeTxtFld;

    @FXML
    private TableColumn<?, ?> classLectureClm;

    @FXML
    private ComboBox<?> classLectureCmbBox;

    @FXML
    private AnchorPane classSchedule;

    @FXML
    private TableView<?> classScheduleTbl;

    @FXML
    private TableColumn<?, ?> classStartTimeClm;

    @FXML
    private TextField classStartTimeTxtFld;

    @FXML
    private TableColumn<?, ?> classSubjectClm;

    @FXML
    private ComboBox<?> classSubjectCmbBox;

    @FXML
    private TableColumn<?, ?> classdateClm;

    @FXML
    private Button createClassBtn;

    @FXML
    void onClickCreateClassBtn(ActionEvent event) {

    }

}
