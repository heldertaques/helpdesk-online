package usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepositorioUsuario implements InterfaceUsuario{

	public void inserirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = ("insert into usuarios (ulogin, unome, usenha, uprivilegio, ustatus) values (?,?,md5(?),?,?)");
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, usuario.getLoginName());
		pstmt.setString(2, usuario.getNome());
		pstmt.setString(3, usuario.getSenha());
		pstmt.setInt(4, usuario.getPrivilegio());
		pstmt.setBoolean(5, usuario.getStatus());
		
		pstmt.executeUpdate();
	}

}
