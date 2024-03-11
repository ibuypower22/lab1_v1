module com.example.lab1_v1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.antlr.antlr4.runtime;

    opens com.example.lab1_v1 to javafx.fxml;
    exports com.example.lab1_v1;
}