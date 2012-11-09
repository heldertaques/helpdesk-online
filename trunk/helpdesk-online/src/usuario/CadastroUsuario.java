package usuario;

import java.sql.SQLException;

public class CadastroUsuario {
	private InterfaceUsuario repositorioUsuario = new RepositorioUsuario();
	public void inserirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException{
		repositorioUsuario.inserirUsuario(usuario);
	}

}
