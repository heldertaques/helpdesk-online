package cargo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;

import conexao.Conexao;

public class RepositorioCargo implements InterfaceCargo{

	public void inserirCargo(Cargo cargo) throws ClassNotFoundException, SQLException {
		
		Connection con = Conexao.conectarBanco();
		String sql = ("insert into cargos values(?,?)");
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, cargo.getCodigo());
		pstmt.setString(2, cargo.getDescricao());
		pstmt.executeUpdate();
	}
	
	public Integer pesquisarProximoCodCargo() throws ClassNotFoundException, SQLException{
		
		Connection con = Conexao.conectarBanco();
		String sql = ("select * from cargos order by codigo asc");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		int codCargo = 0;
		while (rs.next()) {
			codCargo = rs.getInt("codigo");
		}
		
		return codCargo + 1;
	}
	public Collection<Cargo> pesquisarTodosCargos() throws ClassNotFoundException, SQLException{
		
		Collection<Cargo> listaCargo = new LinkedList<Cargo>();
		Connection con = Conexao.conectarBanco();
		Statement stmt = con.createStatement();
		String sql = "select * from cargos";
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			Cargo cargo = new Cargo();
			cargo.setCodigo(rs.getInt("codigo"));
			cargo.setDescricao(rs.getString("descricao"));
			listaCargo.add(cargo);
		}
		return listaCargo;
	}

}
