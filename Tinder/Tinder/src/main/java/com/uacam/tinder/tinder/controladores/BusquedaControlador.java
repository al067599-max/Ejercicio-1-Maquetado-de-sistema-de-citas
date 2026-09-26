package com.uacam.tinder.tinder.controladores;

import com.uacam.tinder.tinder.Navegacion;
import javafx.fxml.FXML;

public class BusquedaControlador {
    @FXML private void onVerPerfil() { Navegacion.loadView("/com/uacam/tinder/tinder/views/PerfilDetalleView.fxml"); }
    @FXML private void onIrAMiPerfil() { Navegacion.loadView("/com/uacam/tinder/tinder/views/MiPerfilView.fxml"); }
    @FXML private void onIrAMensajes() { Navegacion.loadView("/com/uacam/tinder/tinder/views/BandejaMensajesView.fxml"); }
    @FXML private void onIrAIntegrantes() { Navegacion.loadView("/com/uacam/tinder/tinder/views/Equipo.fxml"); }
}