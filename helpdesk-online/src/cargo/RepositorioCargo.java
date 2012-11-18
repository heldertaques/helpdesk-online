package cargo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.Conexao;

public class RepositorioCargo implements InterfaceCargo{

	public void inserirCargo(Cargo cargo) {
		
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

}
