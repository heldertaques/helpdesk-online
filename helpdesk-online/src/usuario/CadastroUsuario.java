package usuario;

import java.sql.SQLException;

public class CadastroUsuario {
	private InterfaceUsuario repositorioUsuario = new RepositorioUsuario();
	public void inserirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException{
		repositorioUsuario.inserirUsuario(usuario);
	}
	public Usuario pesquisarPorLogin(String login, String senha) throws ClassNotFoundException, SQLException
	{
		Usuario u = new Usuario();
		u = repositorioUsuario.pesquisarPorLogin(login, senha);
		return u;
	}
}
