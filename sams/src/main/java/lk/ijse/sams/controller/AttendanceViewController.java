package lk.ijse.sams.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AttendanceViewController {

    @FXML
    private ComboBox<?> attendanceCourseCmbBox;

    @FXML
    private TextField attendanceDateTxtFld;

    @FXML
    private TextField attendanceLectureTxtFld;

    @FXML
    private ComboBox<?> attendanceSessionCmbBox;

    @FXML
    private TableColumn<?, ?> attendanceStatusClm;

    @FXML
    private TableColumn<?, ?> attendanceStudentNameClm;

    @FXML
    private TableColumn<?, ?> attendanceStudentRegNoClm;

    @FXML
    private ComboBox<?> attendanceSubjectCmbBox;

    @FXML
    private TableView<?> attendanceTbl;

    @FXML
    private Button saveAttendanceBtn;

    @FXML
    void onClickSaveAttendanceBtn(ActionEvent event) {

    }

}
