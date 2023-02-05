package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;;

public class Alerts {
	public static void showAlert(String titulo, String header, String content, AlertType type) {
		Alert alerta = new Alert(type);
		alerta.setTitle(titulo);
		alerta.setContentText(content);
		alerta.setHeaderText(header);
		alerta.show();
	}
}
