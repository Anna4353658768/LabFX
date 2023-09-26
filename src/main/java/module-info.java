module com.example.labfx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.labfx to javafx.fxml;
    exports com.example.labfx;
}