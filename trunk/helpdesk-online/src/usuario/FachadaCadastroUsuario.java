package usuario;

import java.sql.SQLException;

public class FachadaCadastroUsuario {
	
	public void inserirUsuario(String nome, String loginName, String senha, String privilegio, String status) throws ClassNotFoundException, SQLException
	{
		Usuario u = new Usuario();
		CadastroUsuario cadastroUsuario = new CadastroUsuario();
		
		u.setNome(nome);
		u.setLoginName(loginName);
		u.setSenha(senha);
		u.setPrivilegio(Integer.parseInt(privilegio));
		u.setStatus(Boolean.parseBoolean(status));
		
		cadastroUsuario.inserirUsuario(u);
	}
	

}
