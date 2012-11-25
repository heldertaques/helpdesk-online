package usuario;

import java.sql.SQLException;
import java.util.Collection;

public interface InterfaceUsuario {
	public void inserirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException;
	public Usuario pesquisarPorLogin(String login, String senha) throws ClassNotFoundException, SQLException;
	public Collection<Usuario> pesquisarTodosUsuarios() throws ClassNotFoundException, SQLException;
	public Usuario pesquisarPorCodigo(String codigo) throws ClassNotFoundException, SQLException;
	public void alterarUsuario(Usuario usuario) throws ClassNotFoundException, SQLException;
}
