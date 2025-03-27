package Models;

public class Usuario {
	
	private String NombreUsuario, Password;

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Usuario(String nombreUsuario, String password) {
		NombreUsuario = nombreUsuario;
		Password = password;
	}
}
