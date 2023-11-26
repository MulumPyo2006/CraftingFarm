module project.java.craftingfarm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens project.java.craftingfarm to javafx.fxml;
    exports project.java.craftingfarm;
}