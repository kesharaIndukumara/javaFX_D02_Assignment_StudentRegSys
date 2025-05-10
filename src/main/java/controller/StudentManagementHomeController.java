package controller;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Student;

import java.io.IOException;

public class StudentManagementHomeController {

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        int index = search(txtEmail.getText(),txtPassword.getText());
        if(index != -1){

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/studentManagement_DashBoard.fxml"));
            Parent root = loader.load();

            StudentManagementDashBoardController controller = loader.getController();
            controller.setLogStudentIndex(index);

            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        }else{
            new Alert(Alert.AlertType.ERROR,"Somthing went wrong!..").show();
        }
    }



    @FXML
    void btnNewStudentOnAction(ActionEvent event) throws IOException {
//        Stage stage = new Stage();
//        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/studentManagement_Reg.fxml"))));
//        stage.setTitle("Student Management System - Register");
//        stage.show();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/studentManagement_Reg.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    public int search(String username, String password ) {
        int size = dbConnection.getInstance().getStudentList().size();

        for (int i=0; i<size; i++){
            Student studentListObj = dbConnection.getInstance().getStudentList().get(i);

            if(username.equalsIgnoreCase(studentListObj.getEmail()) && password.equalsIgnoreCase(studentListObj.getPassword())){
                return i;
            }
        }
        return -1;
    }


}
