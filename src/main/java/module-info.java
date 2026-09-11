module com.example.diakok20260904 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires junit;

    opens com.example.diakok20260904 to javafx.fxml;
    exports com.example.diakok20260904;
}