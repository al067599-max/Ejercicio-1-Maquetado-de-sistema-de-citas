package com.uacam.tinder.tinder.controladores;

import com.uacam.tinder.tinder.Navegacion;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MensajesControlador {
    @FXML private Label lblDatosContacto;
    @FXML private ListView<String> listMensajes;

    @FXML

    public void initialize() {
        listMensajes.getItems().addAll(
                "Andrea López quiere contactarte - \"Hola, vi que también te gusta el senderismo...\""
        );
    }
    @FXML
    private void onAceptar() {
        lblDatosContacto.setText("¡Solicitud aceptada! Contacto: Andrea López - Tel: 555-123-4567 | Email: andrea.lopez@ejemplo.com");
    }

    @FXML
    private void onRechazar() {
        lblDatosContacto.setText("Solicitud rechazada. No se compartieron datos de contacto.");
    }

    @FXML
    private void onVolver() {
        Navegacion.loadView("/com/uacam/tinder/tinder/views/BusquedaFiltrosView.fxml");
    }
}