package controller;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Student;

import java.io.IOException;


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
        int oldSize = dbConnection.getInstance().getStudentList().size();
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
        int newSize = dbConnection.getInstance().getStudentList().size();
        if (oldSize<newSize){
            new Alert(Alert.AlertType.CONFIRMATION,txtStudentId.getText()+" Successfully Added").show();
        }
    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/studentManagement_Home.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
