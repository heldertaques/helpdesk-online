package email;

import java.sql.SQLException;

public interface InterfaceEmail {
	public void configurarEmail(Email email) throws ClassNotFoundException, SQLException;
	public Email pegarConfigEmail() throws ClassNotFoundException, SQLException;

}
