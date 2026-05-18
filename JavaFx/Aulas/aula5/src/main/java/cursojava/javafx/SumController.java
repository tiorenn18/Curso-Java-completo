package cursojava.javafx;

import java.util.Locale;

import cursojava.javafx.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SumController {

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

            result.setText(String.format("%.2f", sum));

        } catch (NumberFormatException e) {
            Alerts.showAlerts("Error", "Parse error", e.getMessage(), AlertType.ERROR);
        }
    }
}
