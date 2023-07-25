module com.example.bookshopmangementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.bookshopmangementsystem to javafx.fxml;
    exports com.example.bookshopmangementsystem;
}