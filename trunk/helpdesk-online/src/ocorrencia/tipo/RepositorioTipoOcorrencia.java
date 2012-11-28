package ocorrencia.tipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Collection;
import java.util.LinkedList;

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

	public Collection<TipoOcorrencia> listarTipoOcorrencias() throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Collection<TipoOcorrencia> listaTipoOcorrencia = new LinkedList<TipoOcorrencia>();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from tipo_ocorrencia");
		while (rs.next()){
			TipoOcorrencia tpOcorrencia = new TipoOcorrencia(); 
			tpOcorrencia.setCodigo(rs.getInt("codigo"));
			tpOcorrencia.setDescricao(rs.getString("descricao"));
			tpOcorrencia.setSla(String.valueOf(rs.getTime("sla")));
			listaTipoOcorrencia.add(tpOcorrencia);
		}
		return listaTipoOcorrencia;
	}
	

}
