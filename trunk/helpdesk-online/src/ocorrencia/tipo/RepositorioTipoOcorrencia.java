package ocorrencia.tipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import conexao.Conexao;

public class RepositorioTipoOcorrencia implements InterfaceTipoOcorrencia{

	public void inserirTipoOcorrencia(TipoOcorrencia tipoOcorrencia) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = "insert into tipo_ocorrencia (descricao,sla) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, tipoOcorrencia.getDescricao());
		pstmt.setTime(2, Time.valueOf(tipoOcorrencia.getSla()));
		pstmt.executeUpdate();
	}
	

}
