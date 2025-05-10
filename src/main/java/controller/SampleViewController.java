package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleViewController {

    @FXML
    private Label lblAddress;

    @FXML
    private Label lblAge;

    @FXML
    private Label lblGrade;

    @FXML
    private Label lblName;

    @FXML
    private Label lblPhoneNumber;

    @FXML
    private TextArea txtAddress;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtGrade;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    void btnRegOnAction(ActionEvent event) {
        lblName.setVisible(true);
        lblName.setText(txtName.getText());

        lblAge.setVisible(true);
        lblAge.setText(txtAge.getText());

        lblPhoneNumber.setVisible(true);
        lblPhoneNumber.setText(txtPhoneNumber.getText());

        lblGrade.setVisible(true);
        lblGrade.setText(txtGrade.getText());

        lblAddress.setVisible(true);
        lblAddress.setText(txtAddress.getText());
    }

}
