package ocorrencia;

import java.sql.SQLException;
import java.util.Collection;

public class FachadaOcorrencia {
	private CadastroOcorrencia cadOcorrencia = new CadastroOcorrencia();
	
	public Integer pegarNumeroOcorrencia() throws ClassNotFoundException, SQLException{
		return cadOcorrencia.pegarNumeroOcorrencia();
	}
	public void inserirOcorrencia(String oc_numero, String descricao, String solicitante, String tipoOcorr, 
									String equipamento, String status) throws ClassNotFoundException, SQLException{
		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia.setOc_numero(oc_numero);
		ocorrencia.setDescricao(descricao);
		ocorrencia.setCd_solicitante(Integer.parseInt(solicitante));
		ocorrencia.setCd_tipo(Integer.parseInt(tipoOcorr));
		ocorrencia.setCd_equipamento(Integer.parseInt(equipamento));
		ocorrencia.setCd_status(Integer.parseInt(status));
		cadOcorrencia.inserirOcorrencia(ocorrencia);
	}
	public void alterarOcorrencia(String oc_numero, String cd_responsavel, String cd_status, String info_fechamento, String data_fechamento ) throws ClassNotFoundException, SQLException{
		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia.setOc_numero(oc_numero);
		ocorrencia.setCd_responsavel(Integer.parseInt(cd_responsavel));
		ocorrencia.setCd_status(Integer.parseInt(cd_status));
		ocorrencia.setData_fechamento(data_fechamento);
		ocorrencia.setInfo_fechamento(info_fechamento);
		cadOcorrencia.alterarOcorrencia(ocorrencia);
	}
	public Collection<Ocorrencia> listarTodasOcorrencias() throws ClassNotFoundException, SQLException{
		return cadOcorrencia.listarTodasOcorrencias();
	}
	public Collection<Ocorrencia> listarOcorrenciasNaoIniciadas(String status) throws ClassNotFoundException, SQLException{
		return cadOcorrencia.listarOcorrenciasNaoIniciadas(status);
	}
	public Collection<Ocorrencia> listarOcorrenciasPendentes(String status) throws ClassNotFoundException, SQLException{
		return cadOcorrencia.listarOcorrenciasPendentes(status);
	}
	public Collection<Ocorrencia> listarOcorrenciasEmAndamento(String status) throws ClassNotFoundException, SQLException{
		return cadOcorrencia.listarOcorrenciasEmAndamento(status);
	}
	public Collection<Ocorrencia> listarOcorrenciasFechadas(String status) throws ClassNotFoundException, SQLException{
		return cadOcorrencia.listarOcorrenciasFechadas(status);
	}
	public Ocorrencia pesquisarOcorrenciaPorCodigo(String codigo) throws ClassNotFoundException, SQLException{
		return cadOcorrencia.pesquisarOcorrenciaPorCodigo(codigo);
	}
	public Collection<Ocorrencia> pesquisarOcorrenciaPorSolicitante(String codigo) throws ClassNotFoundException, SQLException{
		return cadOcorrencia.pesquisarOcorrenciaPorSolicitante(codigo);
	}
	public Collection<Ocorrencia> pesquisarOcorrenciaPorStatus(String codigo) throws ClassNotFoundException, SQLException{
		return cadOcorrencia.pesquisarOcorrenciaPorStatus(codigo);
	}

}
