package ocorrencia.status;

import java.sql.SQLException;
import java.util.Collection;

import ocorrencia.status.exception.DescricaoStatusOcorrenciaVaziaException;

public class FachadaStatusOcorrencia {
	CadastroStatusOcorrencia cadStatusOcorrencia = new CadastroStatusOcorrencia();
	public void inserirStatusOcorrencia(String descricao) throws ClassNotFoundException, SQLException, DescricaoStatusOcorrenciaVaziaException{
		StatusOcorrencia statusOcorrencia = new StatusOcorrencia();
		if (statusOcorrencia.getStatus().isEmpty()){
			throw new DescricaoStatusOcorrenciaVaziaException();
		}
		statusOcorrencia.setStatus(descricao);
		
		cadStatusOcorrencia.inserirStatusOcorrencia(statusOcorrencia);
	}
	public Collection<StatusOcorrencia> listarStatusOcorrencia() throws ClassNotFoundException, SQLException{
		return cadStatusOcorrencia.listarStatusOcorrencia();
	}
}
