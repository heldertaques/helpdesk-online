package usuario;

import java.sql.SQLException;

public interface InterfaceUsuario {
	public void inserirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException;
	public Usuario pesquisarPorLogin(String login, String senha) throws ClassNotFoundException, SQLException;

}
