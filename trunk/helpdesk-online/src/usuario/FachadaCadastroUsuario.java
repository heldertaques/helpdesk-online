package usuario;

import java.sql.SQLException;
import java.util.Collection;

public class FachadaCadastroUsuario {
	CadastroUsuario cadUsuario = new CadastroUsuario();
	public void inserirUsuario(String codigo, String loginName, String senha, String privilegio, String status) throws ClassNotFoundException, SQLException
	{
		Usuario u = new Usuario();
		
		u.setCodigo(Integer.parseInt(codigo));
		u.setLoginName(loginName);
		u.setSenha(senha);
		u.setPrivilegio(Integer.parseInt(privilegio));
		u.setStatus(Integer.parseInt(status));
		
		cadUsuario.inserirUsuario(u);
	}
	
	public Usuario pesquisarPorLogin(String login, String senha) throws ClassNotFoundException, SQLException
	{
		Usuario u = new Usuario();
		u = cadUsuario.pesquisarPorLogin(login,senha);
		return u;
	}
	public void alterarUsuario(String codigo, String login, String privilegio, String senha, String status){
		Usuario u = new Usuario();
		u.setCodigo(Integer.parseInt(codigo));
		u.setLoginName(login);
		u.setPrivilegio(Integer.parseInt(privilegio));
		u.setSenha(senha);
		u.setStatus(Integer.parseInt(status));
		cadUsuario.alterarUsuario(u);
	}
	public Collection<Usuario> pesquisarTodosUsuarios() throws ClassNotFoundException, SQLException{
		return cadUsuario.pesquisarTodosUsuarios();
	}
	public Usuario pesquisarPorCodigo(String codigo) throws ClassNotFoundException, SQLException{
		return cadUsuario.pesquisarPorCodigo(codigo);
	}

}
