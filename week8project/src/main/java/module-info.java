module com.mycompany.week8project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.week8project to javafx.fxml;
    exports com.mycompany.week8project;
}
