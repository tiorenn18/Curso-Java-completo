package curso.javafx;

import java.io.IOException;

import curso.javafx.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {

    @FXML
    private void testAction() throws IOException {
        Alerts.showAlerts("Alert Title", null, "Hello", AlertType.ERROR);
    }
}
