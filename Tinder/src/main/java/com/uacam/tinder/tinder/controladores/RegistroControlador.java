package com.uacam.tinder.tinder.controladores;

import com.uacam.tinder.tinder.Navegacion;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;              // <-- nuevo
import javafx.scene.control.SpinnerValueFactory;   // <-- nuevo
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class RegistroControlador {
    @FXML private Label lblFotoSeleccionada;
    @FXML private ImageView imgPreview;
    @FXML private ComboBox<String> cbGenero;
    @FXML private Spinner<Integer> spEdad;

    @FXML
    public void initialize() {
        cbGenero.getItems().addAll("Masculino", "Femenino", "Otro", "Prefiero no decir");

        spEdad.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(18, 99, 18)
        );
    }

    @FXML
    private void onSeleccionarFoto() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Selecciona tu foto de perfil");
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Imágenes", "*.png", "*.jpg", "*.jpeg")
        );

        Stage stage = (Stage) lblFotoSeleccionada.getScene().getWindow();
        File archivo = fileChooser.showOpenDialog(stage);

        if (archivo != null) {
            lblFotoSeleccionada.setText(archivo.getName());
            Image imagen = new Image(archivo.toURI().toString());
            imgPreview.setImage(imagen);
        }
    }

    @FXML
    private void onContinuar() {
        Navegacion.loadView("/com/uacam/tinder/tinder/views/BusquedaFiltrosView.fxml");
    }
}