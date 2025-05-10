package controller;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
        int index = search(txtEmail.getText());
        if(index != -1){
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/studentManagement_DashBoard.fxml"))));
            stage.setTitle("Student Management System - DashBoard");

            stage.show();

        }else{
            new Alert(Alert.AlertType.ERROR,"Somthing went wrong!..").show();
        }
    }



    @FXML
    void btnNewStudentOnAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/studentManagement_Reg.fxml"))));
        stage.setTitle("Student Management System - Register");
        stage.show();

    }

    public int search(String str) {
        int size = dbConnection.getInstance().getStudentList().size();
        System.out.println(str);

        for (int i=0; i<size; i++){
            Student studentListObj = dbConnection.getInstance().getStudentList().get(i);

            if(str.equalsIgnoreCase(studentListObj.getEmail())){

                return i;
            }
        }
        return -1;
    }


}
