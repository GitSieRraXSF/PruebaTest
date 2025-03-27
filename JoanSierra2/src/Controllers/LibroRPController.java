package Controllers;

import java.util.ArrayList;
import java.util.regex.Pattern;

import Models.Libro;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LibroRPController {
	
	private ArrayList<Libro> Libros = new ArrayList<>();
	private String isbnAnterior = "";

	@FXML
	private Button OutLibros, RegistrarLib;
	
	@FXML
	private TextField TituloField, AutorField, FechaField, ISBNField, DisponField;
	
	@FXML
	private void MostrarLibros_Out() {
		for (int i = 0; i < Libros.size(); i++) {
			if (Boolean.parseBoolean(DisponField.getText()) == false) {
				Libros.get(i).MostrarLibro();
			}
		}
	}
	
	@FXML
	private void RegistLibro_in() {
		if (TituloField.getText().isBlank() || AutorField.getText().isBlank() || FechaField.getText().isBlank() || ISBNField.getText().isBlank() || DisponField.getText().isBlank()) {
			showAlert("ERROR!", "Ingrese los valores importantes", AlertType.ERROR);
		} else if (Pattern.matches("[978{3}[0-9]{10}", ISBNField.getText())) {
			if (!ISBNField.getText().equals(isbnAnterior)) {
				isbnAnterior = ISBNField.getText();
				if (Integer.parseInt(FechaField.getText()) > -800 && Integer.parseInt(FechaField.getText()) < 2025){
					Libros.add(new Libro(TituloField.getText(), AutorField.getText(), Integer.parseInt(FechaField.getText()), Integer.parseInt(ISBNField.getText()), Boolean.parseBoolean(DisponField.getText())));
					showAlert("EXITO!", "Gracias por registrar el libro!", AlertType.CONFIRMATION);
				} else {
					showAlert("ERROR!", "Ingrese un año valido [800 a. C. á 2025 d. C.]", AlertType.ERROR);
				}
			} else {
				showAlert("ERROR!", "Ingrese un ISBN diferente", AlertType.ERROR);
			}
		} else {
			showAlert("ERROR!", "La informacion ingresada no e valida", AlertType.ERROR);
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