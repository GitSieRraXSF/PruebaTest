package Controllers;

import java.util.ArrayList;

import Models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainUserController {
	
	private ArrayList<Usuario> Personas = new ArrayList<>();
	private String NombreValido1 = "admin"; private String Password1 = "admin123";
	private String NombreValido2 = "usuario1"; private String Password2 = "pass1234";
	private String NombreValido3 = "juanperez"; private String Password3 = "juan2024";
	private String NombreValido4 = "maria98"; private String Password4 = "maria456";
	private String NombreValido5 = "sofia23"; private String Password5 = "sofia789";
	
	@FXML
	private TextField NombreField, PasswordField;
	
	@FXML
	private Button IngresarBut;
	
	@FXML
	private void EntrarUser() {
		if (NombreField.getText().isBlank() || PasswordField.getText().isBlank()) {
			showAlert("ERROR!", "Llenar los espacios en blanco", AlertType.WARNING);
		} else if ((NombreField.getText().equals(NombreValido1)||NombreField.getText().equals(NombreValido2)||NombreField.getText().equals(NombreValido3)||NombreField.getText().equals(NombreValido4)||NombreField.getText().equals(NombreValido5))&&(PasswordField.getText().equals(Password1)||PasswordField.getText().equals(Password2)||PasswordField.getText().equals(Password3)||PasswordField.getText().equals(Password4)||PasswordField.getText().equals(Password5))) {
			Personas.add(new Usuario(NombreField.getText(), PasswordField.getText()));
		} else {
			showAlert("ERROR!", "El usuario no existe", AlertType.WARNING);
		}
	}
	
	private void showAlert(String title, String message, AlertType type) {
		Alert alert = new Alert(type); 
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
}