module com.efr.production_order {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.efr.production_order to javafx.fxml;
    exports com.efr.production_order;
}