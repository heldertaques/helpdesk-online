package ocorrencia;

import java.sql.SQLException;
import java.util.Collection;

public interface InterfaceOcorrencia {
	public Integer pegarNumeroOcorrencia() throws ClassNotFoundException, SQLException;
	public void inserirOcorrencia(Ocorrencia ocorrencia) throws ClassNotFoundException, SQLException;
	public Collection<Ocorrencia> listarTodasOcorrencias() throws ClassNotFoundException, SQLException;
	public Collection<Ocorrencia> listarOcorrenciasNaoIniciadas(String status) throws ClassNotFoundException, SQLException;
	public Collection<Ocorrencia> listarOcorrenciasPendentes(String status) throws ClassNotFoundException, SQLException;
	public Collection<Ocorrencia> listarOcorrenciasEmAndamento(String status) throws ClassNotFoundException, SQLException;
	public Collection<Ocorrencia> listarOcorrenciasFechadas(String status) throws ClassNotFoundException, SQLException;
	public Ocorrencia pesquisarOcorrenciaPorCodigo(String codigo) throws ClassNotFoundException, SQLException;
	public Collection<Ocorrencia> pesquisarOcorrenciaPorSolicitante(String codigo) throws ClassNotFoundException, SQLException;
	public Collection<Ocorrencia> pesquisarOcorrenciaPorStatus(String codigo) throws ClassNotFoundException, SQLException;
}
