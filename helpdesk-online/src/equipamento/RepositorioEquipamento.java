package equipamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;

public class RepositorioEquipamento implements InterfaceEquipamento {

	public void inserirEquipamento(Equipamento equipamento) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = "insert into equipamento (descricao) values(?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, equipamento.getDescricao());
		pstmt.executeUpdate();
	}
	

}
