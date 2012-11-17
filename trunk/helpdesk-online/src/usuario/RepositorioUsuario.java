package usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;

public class RepositorioUsuario implements InterfaceUsuario{

	public void inserirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = ("insert into usuarios (login, codigo, senha, privilegio, status) values (?,?,md5(?),?,?)");
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, usuario.getLoginName());
		pstmt.setInt(2, usuario.getCodigo());
		pstmt.setString(3, usuario.getSenha());
		pstmt.setInt(4, usuario.getPrivilegio());
		pstmt.setInt(5, usuario.getStatus());
		
		pstmt.executeUpdate();
	}

	public Usuario pesquisarPorLogin(String login, String senha) throws ClassNotFoundException, SQLException
	{
		Usuario u = new Usuario();
		Connection con = Conexao.conectarBanco();
		PreparedStatement pstmt = con.prepareStatement("select * from usuarios where ulogin = ? and usenha = md5(?)");
		pstmt.setString(1, login);
		pstmt.setString(2, senha);

		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			u.setLoginName(rs.getString("ulogin"));
			u.setSenha(rs.getString("usenha"));
			u.setPrivilegio(rs.getInt("uprivilegio"));
			u.setStatus(rs.getInt("ustatus"));
		}
		return u;	}
}
