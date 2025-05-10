package controller;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Student;


public class StudentManagementRegController {

    public PasswordField txtPassword;
    public TextField txtEmail;
    @FXML
    private TextArea txtAddress;

    @FXML
    private TextField txtContactNumber;

    @FXML
    private TextField txtFName;

    @FXML
    private TextField txtLName;

    @FXML
    private TextField txtStudentId;

    @FXML
    void btnSubmitOnAction(ActionEvent event) {
        dbConnection.getInstance().getStudentList().add(
                new Student(
                        txtStudentId.getText(),
                        txtFName.getText(),
                        txtEmail.getText(),
                        txtContactNumber.getText(),
                        txtAddress.getText(),
                        txtPassword.getText()
                )
        );
        int size = dbConnection.getInstance().getStudentList().size();
        if (size == 1){
            new Alert(Alert.AlertType.CONFIRMATION,txtStudentId.getText()+" Successfully Added").show();
        }
    }

}
