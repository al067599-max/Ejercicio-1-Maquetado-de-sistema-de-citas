package com.uacam.tinder.tinder.controladores;

import com.uacam.tinder.tinder.Navegacion;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class AvisoControlador {
    @FXML private CheckBox chkAcepto;

    @FXML
    private void onAceptar() {
        if (chkAcepto.isSelected()) {
            Navegacion.loadView("/com/uacam/tinder/tinder/views/RegistroInicialView.fxml");
        }
    }
}