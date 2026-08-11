module lk.ijse.sams {
    requires javafx.controls;
    requires javafx.fxml;

    opens lk.ijse.sams to javafx.fxml;
    opens lk.ijse.sams.controller to javafx.fxml;
    exports lk.ijse.sams;
}
