package ocorrencia;

import java.sql.SQLException;
import java.util.Collection;

public class CadastroOcorrencia {
	private InterfaceOcorrencia interfaceOcorrencia = new RepositorioOcorrencia();
	
	public Integer pegarNumeroOcorrencia() throws ClassNotFoundException, SQLException{
		return interfaceOcorrencia.pegarNumeroOcorrencia();
	}
	public void inserirOcorrencia(Ocorrencia ocorrencia) throws ClassNotFoundException, SQLException{
		interfaceOcorrencia.inserirOcorrencia(ocorrencia);
	}
	public Collection<Ocorrencia> listarTodasOcorrencias() throws ClassNotFoundException, SQLException{
		return interfaceOcorrencia.listarTodasOcorrencias();
	}
	public Collection<Ocorrencia> listarOcorrenciasNaoIniciadas(String status) throws ClassNotFoundException, SQLException{
		return interfaceOcorrencia.listarOcorrenciasNaoIniciadas(status);
	}
	public Collection<Ocorrencia> listarOcorrenciasPendentes(String status) throws ClassNotFoundException, SQLException{
		return interfaceOcorrencia.listarOcorrenciasPendentes(status);
	}
	public Collection<Ocorrencia> listarOcorrenciasEmAndamento(String status) throws ClassNotFoundException, SQLException{
		return interfaceOcorrencia.listarOcorrenciasEmAndamento(status);
	}
	public Collection<Ocorrencia> listarOcorrenciasFechadas(String status) throws ClassNotFoundException, SQLException{
		return interfaceOcorrencia.listarOcorrenciasFechadas(status);
	}
	public Ocorrencia pesquisarOcorrenciaPorCodigo(String codigo) throws ClassNotFoundException, SQLException{
		return interfaceOcorrencia.pesquisarOcorrenciaPorCodigo(codigo);
	}
	
}
