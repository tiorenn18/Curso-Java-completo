module cursojava.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens cursojava.javafx to javafx.fxml;
    exports cursojava.javafx;
}
