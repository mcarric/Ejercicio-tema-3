module com.example.introprogejercicios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.introprogejercicios to javafx.fxml;
    exports com.example.introprogejercicios;
}