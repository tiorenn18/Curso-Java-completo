module curso.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens curso.javafx to javafx.fxml;
    exports curso.javafx;
}
