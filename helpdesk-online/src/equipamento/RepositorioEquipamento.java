package equipamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;

import conexao.Conexao;

public class RepositorioEquipamento implements InterfaceEquipamento {

	public void inserirEquipamento(Equipamento equipamento) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = "insert into equipamento (descricao) values(?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, equipamento.getDescricao());
		pstmt.executeUpdate();
	}

	public Collection<Equipamento> listarEquipamentos() throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Statement stmt = con.createStatement();
		Collection<Equipamento> listaEquipamento = new LinkedList<Equipamento>();
		ResultSet rs = 	stmt.executeQuery("select * from equipamento");

		while(rs.next()){
			Equipamento equipamento = new Equipamento();
			equipamento.setCodigo(rs.getInt("codigo"));
			equipamento.setDescricao(rs.getString("descricao"));
			listaEquipamento.add(equipamento);
		}
		
		return listaEquipamento;
	}
	

}
