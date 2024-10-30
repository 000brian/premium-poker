module org.example.premiumpoker {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.premiumpoker to javafx.fxml;
    exports org.example.premiumpoker;
}