package com.uacam.tinder.tinder.controladores;

import com.uacam.tinder.tinder.Navegacion;
import javafx.fxml.FXML;

public class MiPerfilControlador {
    @FXML private void onGuardar() { Navegacion.loadView("/com/uacam/tinder/tinder/views/BusquedaFiltrosView.fxml"); }
    @FXML private void onVolver() { Navegacion.loadView("/com/uacam/tinder/tinder/views/BusquedaFiltrosView.fxml"); }
}