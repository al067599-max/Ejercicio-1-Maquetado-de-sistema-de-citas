package com.uacam.tinder.tinder.controladores;

import com.uacam.tinder.tinder.Navegacion;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MensajesControlador {
    @FXML private Label lblDatosContacto;

    @FXML
    private void onAceptar() {
        lblDatosContacto.setText("¡Solicitud Aceptada! Contacto: Vaginafran Santini - Tel: +52 981 207 5273 | Email: al068994@uacam.mx");
    }

    @FXML
    private void onVolver() {
        Navegacion.loadView("/com/uacam/tinder/tinder/views/BusquedaFiltrosView.fxml");
    }
}