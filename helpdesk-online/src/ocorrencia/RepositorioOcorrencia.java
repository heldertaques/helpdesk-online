package ocorrencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.Conexao;

public class RepositorioOcorrencia implements InterfaceOcorrencia{

	public Integer pegarNumeroOcorrencia() throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select NumOcorrencia()");
		rs.next();
		int num_ocorrencia = rs.getInt(1);
		return num_ocorrencia;
	}

	public void inserirOcorrencia(Ocorrencia ocorrencia) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = "insert into ocorrencias (oc_numero,descricao,cd_solicitante,cd_tipo,cd_equipamento," +
				" cd_status) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, ocorrencia.getOc_numero());
		pstmt.setString(2, ocorrencia.getDescricao());
		pstmt.setInt(3, ocorrencia.getCd_solicitante());
		pstmt.setInt(4, ocorrencia.getCd_tipo());
		pstmt.setInt(5, ocorrencia.getCd_equipamento());
		pstmt.setInt(6, ocorrencia.getCd_status());
		pstmt.executeUpdate();
	}

}
