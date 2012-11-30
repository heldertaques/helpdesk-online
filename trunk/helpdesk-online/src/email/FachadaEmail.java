package email;

import java.sql.SQLException;

public class FachadaEmail {
	private CadastroEmail cadEmail = new CadastroEmail();
	public void configurarEmail(String host, String port, String protocol, String starttls, String authent, String mailUser, String passwd) throws ClassNotFoundException, SQLException{
		Email email = new Email();
		email.setHost(host);
		email.setPort(port);
		email.setMailUser(mailUser);
		email.setPasswd(passwd);
		cadEmail.configurarEmail(email);
	}
	public Email pegarConfigEmail() throws ClassNotFoundException, SQLException{
		return cadEmail.pegarConfigEmail();
	}
}
