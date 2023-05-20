module com.example.libraryklokol {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires java.sql;

            

                        
    opens LibraryKlokol to javafx.fxml;
    exports LibraryKlokol;
}