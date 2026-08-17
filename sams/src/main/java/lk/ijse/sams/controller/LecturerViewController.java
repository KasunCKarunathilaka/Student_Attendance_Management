package lk.ijse.sams.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import lk.ijse.sams.App;

public class LecturerViewController {

    @FXML
    private Button lecViewAttendanceBtn;

    @FXML
    private Button lecViewLogOutBtn;

    @FXML
    private Button lecViewReportBtn;

    @FXML
    void onClickLecViewAttendanceBtn(ActionEvent event) throws IOException {
     FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/attendance-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
    }

    @FXML
    void onClickLecViewLogOutBtn(ActionEvent event) throws IOException {
     FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/login-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
     
     Stage currentStage=(Stage)lecViewAttendanceBtn.getScene().getWindow();
     currentStage.close();
    }

    @FXML
    void onClickLecViewReportBtn(ActionEvent event)throws IOException {
        
     FXMLLoader loader=new FXMLLoader(App.class.getResource("/lk/ijse/sams/views/report-view.fxml"));
     Parent root=loader.load();
     Stage stage=new Stage();
     stage.setScene(new Scene(root));
     stage.show();
    }

}
