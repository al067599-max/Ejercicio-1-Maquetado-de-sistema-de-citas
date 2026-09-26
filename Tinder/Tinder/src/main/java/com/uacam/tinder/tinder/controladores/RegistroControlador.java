package com.uacam.tinder.tinder.controladores;

import com.uacam.tinder.tinder.Navegacion;
import javafx.fxml.FXML;

public class RegistroControlador {
    @FXML
    private void onContinuar() {
        Navegacion.loadView("/com/uacam/tinder/tinder/views/BusquedaFiltrosView.fxml");
    }
}