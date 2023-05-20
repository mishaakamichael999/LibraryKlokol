module com.example.libraryklokol {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires java.sql;
    requires de.jensd.fx.glyphs.fontawesome;
            

                        
    opens LibraryKlokol to javafx.fxml;
    exports LibraryKlokol;
}