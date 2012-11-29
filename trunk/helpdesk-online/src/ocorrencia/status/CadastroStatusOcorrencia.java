package ocorrencia.status;

import java.sql.SQLException;
import java.util.Collection;

public class CadastroStatusOcorrencia {
	InterfaceStatusOcorrencia interfaceStatusOcorrencia = new RepositorioStatusOcorrencia();
	public void inserirStatusOcorrencia(StatusOcorrencia statusOcorrencia) throws ClassNotFoundException, SQLException{
		interfaceStatusOcorrencia.inserirStatusOcorrencia(statusOcorrencia);
	}
	public Collection<StatusOcorrencia> listarStatusOcorrencia() throws ClassNotFoundException, SQLException{
		return interfaceStatusOcorrencia.listarStatusOcorrencia();
	}
}
