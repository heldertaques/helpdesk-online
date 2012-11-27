package ocorrencia.status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;

public class RepositorioStatusOcorrencia implements InterfaceStatusOcorrencia{

	public void inserirStatusOcorrencia(StatusOcorrencia statusOcorrencia) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = "insert into Status_Ocorrencia (status) values(?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, statusOcorrencia.getStatus());
		pstmt.executeUpdate();
	}

}
