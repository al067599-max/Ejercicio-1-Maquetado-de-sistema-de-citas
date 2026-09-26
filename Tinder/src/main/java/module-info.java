module com.uacam.tinder.tinder {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.uacam.tinder.tinder to javafx.fxml;
    exports com.uacam.tinder.tinder;

    opens com.uacam.tinder.tinder.controladores to javafx.fxml;
    exports com.uacam.tinder.tinder.controladores;
}