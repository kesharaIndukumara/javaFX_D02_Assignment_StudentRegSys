package controller;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.Setter;
import model.Student;

public class StudentManagementDashBoardController {
    @Setter
    private Student stObj;


    @FXML
    private Label lblAddress;

    @FXML
    private Label lblContactNumber;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblFName;

    @FXML
    private Label lblId;

    @FXML
    private Label lblPassword;

    @FXML
    void btnOnAction(ActionEvent event) {

    }

}
