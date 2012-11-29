package ocorrencia.status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;

import conexao.Conexao;

public class RepositorioStatusOcorrencia implements InterfaceStatusOcorrencia{

	public void inserirStatusOcorrencia(StatusOcorrencia statusOcorrencia) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = "insert into Status_Ocorrencia (status) values(?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, statusOcorrencia.getStatus());
		pstmt.executeUpdate();
	}

	public Collection<StatusOcorrencia> listarStatusOcorrencia() throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Statement stmt = con.createStatement();
		Collection<StatusOcorrencia> listaStatusOcorrencia = new LinkedList<StatusOcorrencia>();
		ResultSet rs = 	stmt.executeQuery("select * from Status_Ocorrencia");

		while(rs.next()){
			StatusOcorrencia statusOcorrencia = new StatusOcorrencia();
			statusOcorrencia.setCodigo(rs.getInt("codigo"));
			statusOcorrencia.setStatus(rs.getString("status"));
			listaStatusOcorrencia.add(statusOcorrencia);
		}

		return listaStatusOcorrencia;
	}

}
