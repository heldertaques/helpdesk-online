package ocorrencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;

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

	public Collection<Ocorrencia> listarTodasOcorrencias() throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Statement stmt = con.createStatement();
		Collection<Ocorrencia> listaOcorrencias = new LinkedList<Ocorrencia>();
		ResultSet rs = stmt.executeQuery("select o.oc_numero,o.descricao,f.nome,so.status from ocorrencias o" +
				" inner join usuarios u on o.cd_solicitante = u.codigo inner join funcionarios f on u.codigo = f.matricula" +
				" inner join status_ocorrencia so on o.cd_status = so.codigo order by oc_numero asc");
		
		while(rs.next()){
			Ocorrencia ocorrencia = new Ocorrencia();
			ocorrencia.setOc_numero(rs.getString("oc_numero"));
			ocorrencia.setDescricao(rs.getString("descricao"));
			ocorrencia.setNomeSolicitante(rs.getString("nome"));
			ocorrencia.setStatus(rs.getString("status"));
			listaOcorrencias.add(ocorrencia);
		}
		return listaOcorrencias;
	}

	public Collection<Ocorrencia> listarOcorrenciasNaoIniciadas(String status) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Collection<Ocorrencia> listaOcorrencias = new LinkedList<Ocorrencia>();
		String sql = "select o.oc_numero,o.descricao,f.nome,so.status from ocorrencias o " +
					 "inner join usuarios u on o.cd_solicitante = u.codigo " +
					 "inner join funcionarios f on u.codigo = f.matricula " +
					 "inner join status_ocorrencia so on o.cd_status = so.codigo " +
					 "where o.cd_status = ? order by oc_numero asc";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(status));
		ResultSet rs = pstmt.executeQuery();

		while(rs.next()){
			Ocorrencia ocorrencia = new Ocorrencia();
			ocorrencia.setOc_numero(rs.getString("oc_numero"));
			ocorrencia.setDescricao(rs.getString("descricao"));
			ocorrencia.setNomeSolicitante(rs.getString("nome"));
			ocorrencia.setStatus(rs.getString("status"));
			listaOcorrencias.add(ocorrencia);
		}
		return listaOcorrencias;
	}

	public Collection<Ocorrencia> listarOcorrenciasPendentes(String status) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Collection<Ocorrencia> listaOcorrencias = new LinkedList<Ocorrencia>();
		String sql = "select o.oc_numero,o.descricao,f.nome,so.status from ocorrencias o " +
					 "inner join usuarios u on o.cd_solicitante = u.codigo " +
					 "inner join funcionarios f on u.codigo = f.matricula " +
					 "inner join status_ocorrencia so on o.cd_status = so.codigo " +
					 "where o.cd_status = ? order by oc_numero asc";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(status));
		ResultSet rs = pstmt.executeQuery();

		while(rs.next()){
			Ocorrencia ocorrencia = new Ocorrencia();
			ocorrencia.setOc_numero(rs.getString("oc_numero"));
			ocorrencia.setDescricao(rs.getString("descricao"));
			ocorrencia.setNomeSolicitante(rs.getString("nome"));
			ocorrencia.setStatus(rs.getString("status"));
			listaOcorrencias.add(ocorrencia);
		}
		return listaOcorrencias;
	}

	public Collection<Ocorrencia> listarOcorrenciasEmAndamento(String status) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Collection<Ocorrencia> listaOcorrencias = new LinkedList<Ocorrencia>();
		String sql = "select o.oc_numero,o.descricao,f.nome,so.status from ocorrencias o " +
					 "inner join usuarios u on o.cd_solicitante = u.codigo " +
					 "inner join funcionarios f on u.codigo = f.matricula " +
					 "inner join status_ocorrencia so on o.cd_status = so.codigo " +
					 "where o.cd_status = ? order by oc_numero asc";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(status));
		ResultSet rs = pstmt.executeQuery();

		while(rs.next()){
			Ocorrencia ocorrencia = new Ocorrencia();
			ocorrencia.setOc_numero(rs.getString("oc_numero"));
			ocorrencia.setDescricao(rs.getString("descricao"));
			ocorrencia.setNomeSolicitante(rs.getString("nome"));
			ocorrencia.setStatus(rs.getString("status"));
			listaOcorrencias.add(ocorrencia);
		}
		return listaOcorrencias;
	}

	public Collection<Ocorrencia> listarOcorrenciasFechadas(String status) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Collection<Ocorrencia> listaOcorrencias = new LinkedList<Ocorrencia>();
		String sql = "select o.oc_numero,o.descricao,f.nome,so.status from ocorrencias o " +
					 "inner join usuarios u on o.cd_solicitante = u.codigo " +
					 "inner join funcionarios f on u.codigo = f.matricula " +
					 "inner join status_ocorrencia so on o.cd_status = so.codigo " +
					 "where o.cd_status = ? order by oc_numero asc";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(status));
		ResultSet rs = pstmt.executeQuery();

		while(rs.next()){
			Ocorrencia ocorrencia = new Ocorrencia();
			ocorrencia.setOc_numero(rs.getString("oc_numero"));
			ocorrencia.setDescricao(rs.getString("descricao"));
			ocorrencia.setNomeSolicitante(rs.getString("nome"));
			ocorrencia.setStatus(rs.getString("status"));
			listaOcorrencias.add(ocorrencia);
		}
		return listaOcorrencias;
	}

	public Ocorrencia pesquisarOcorrenciaPorCodigo(String codigo) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		return null;
	}

}
