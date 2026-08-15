package lk.ijse.sams;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //Parent root=FXMLLoader.load(getClass().getResource("/lk/ijse/sams/views/login-view.fxml"));
       // Parent root=FXMLLoader.load(getClass().getResource("/lk/ijse/sams/views/admin-view.fxml"));
         //Parent root=FXMLLoader.load(getClass().getResource("/lk/ijse/sams/views/lecturer-view.fxml"));
         Parent root=FXMLLoader.load(getClass().getResource("/lk/ijse/sams/views/course-view.fxml"));
       
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Student Attendace Management System");
        Image image=new Image("/lk/ijse/sams/attendance.png");
        stage.getIcons().add(image); 
        stage.centerOnScreen();
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}