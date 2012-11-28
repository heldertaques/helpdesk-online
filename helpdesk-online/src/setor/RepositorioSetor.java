package setor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;

public class RepositorioSetor implements InterfaceSetor{

	public void inserirSetor(Setor setor) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = "insert into setor (nome,gerente) values (?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, setor.getNomeSetor());
		pstmt.setInt(2, setor.getGerente());
		pstmt.executeUpdate();
	}

}
