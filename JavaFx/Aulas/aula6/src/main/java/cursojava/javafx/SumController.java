package cursojava.javafx;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import cursojava.javafx.gui.util.Alerts;
import cursojava.javafx.gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SumController implements Initializable{

    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    @FXML
    private Label result;

    @FXML
    private void sum() {
        try {
            Locale.setDefault(Locale.US);
            double val1 = Double.parseDouble(num1.getText());
            double val2 = Double.parseDouble(num2.getText());

            double sum = val1 + val2;

            result.setText(String.format("%.1f", sum));

        } catch (NumberFormatException e) {
            Alerts.showAlerts("Error", "Parse error", e.getMessage(), AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Constraints.setTextFieldDouble(num1);
        Constraints.setTextFieldDouble(num2);
        Constraints.setTextFieldMaxLength(num1, 12);
        Constraints.setTextFieldMaxLength(num2, 12);
    }
}