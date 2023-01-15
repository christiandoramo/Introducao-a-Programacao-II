package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	@FXML
	private Button botao1;

	@FXML
	private TextField txt1;

	@FXML
	private TextField txt2;

	@FXML
	private Label result;

	@FXML
	private void botao1Action() {
		Locale.setDefault(Locale.US);
		int num1 = Integer.parseInt(txt1.getText());
		int num2 = Integer.parseInt(txt2.getText());
		int sum = num1 + num2;
		result.setText(String.format("%d", sum));
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTxtInt(txt1);
		Constraints.setTxtInt(txt2);
		Constraints.setTxtLength(txt1, 10);
		Constraints.setTxtLength(txt1, 2);
	}

}
