package lk.ijse.sams.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import lk.ijse.sams.App;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class AdminViewController {

    @FXML
    private Button attendanceBtn;

    @FXML
    private Button classSheduleBtn;

    @FXML
    private Button courseMgtBtn;

    @FXML
    private Button lectureMgtBtn;

    @FXML
    private Button logOutBtn;

    @FXML
    private Button reportBtn;

    @FXML
    private Button studentMgtBtn;

    @FXML
    private Button subjectMgtBtn;

    @FXML
    private Button userMgtBtn;

    @FXML
    void onClickAttendanceBtn(ActionEvent event)throws IOException {
        FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/attendance-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
    }

    @FXML
    void onClickClassSheduleBtn(ActionEvent event)throws IOException {
        FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/class-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
    }

    @FXML
    void onClickLectureMgtBtn(ActionEvent event)throws IOException {
        FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/lectureManagement-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
    }

    @FXML
    void onClickLogOutBtn(ActionEvent event)throws IOException {
         FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/login-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
     
     Stage currentStage=(Stage)courseMgtBtn.getScene().getWindow();
     currentStage.close();
    }

    @FXML
    void onClickReportBtn(ActionEvent event) {

    }

    @FXML
    void onClickStudentMgtBtn(ActionEvent event) throws IOException{
        FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/student-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
    }

    @FXML
    void onClickSubjectMgtBtn(ActionEvent event) throws IOException{
        
        FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/subject-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
    }

    @FXML
    void onClickUserMgtBtn(ActionEvent event)throws IOException {

            FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/user-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
    }

    @FXML
    void onClickcourseMgtBtn(ActionEvent event) throws IOException  {
    
    
     FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/course-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();

    }

}
