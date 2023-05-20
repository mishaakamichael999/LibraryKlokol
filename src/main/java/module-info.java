module com.example.libraryklokol {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens com.example.libraryklokol to javafx.fxml;
    exports com.example.libraryklokol;
}