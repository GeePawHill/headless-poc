module org.geepawhill.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.geepawhill.demo to javafx.fxml;
    exports org.geepawhill.demo;
}