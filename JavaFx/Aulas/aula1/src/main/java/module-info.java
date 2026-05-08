module javafx.aula {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafx.aula to javafx.fxml;
    exports javafx.aula;
}
