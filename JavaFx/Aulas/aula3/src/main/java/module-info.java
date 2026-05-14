module curso {
    requires javafx.controls;
    requires javafx.fxml;

    opens curso to javafx.fxml;
    exports curso;
}
