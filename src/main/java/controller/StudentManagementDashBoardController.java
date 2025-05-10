package controller;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Student;

import java.io.IOException;

public class StudentManagementDashBoardController  {
    private Integer index;


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

    public void setLogStudentIndex(int index) {
        this.index = index;

        Student student = dbConnection.getInstance().getStudentList().get(index);
        lblId.setText(student.getId()+"");
        lblFName.setText(student.getFName());
        lblEmail.setText(student.getEmail());
        lblContactNumber.setText(student.getPhoneNumber());
        lblAddress.setText(student.getAddress());
        lblPassword.setText(student.getPassword());
    }


    public void btnLogOutOnActon(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/studentManagement_Home.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
