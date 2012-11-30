package email;

import java.sql.SQLException;

public class CadastroEmail {
	private InterfaceEmail interfaceEmail = new RepositorioEmail();
	public void configurarEmail(Email email) throws ClassNotFoundException, SQLException{
		interfaceEmail.configurarEmail(email);
	}
	public Email pegarConfigEmail() throws ClassNotFoundException, SQLException{
		return interfaceEmail.pegarConfigEmail();
	}
}
