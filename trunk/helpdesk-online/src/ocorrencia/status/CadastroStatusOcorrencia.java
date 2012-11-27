package ocorrencia.status;

import java.sql.SQLException;

public class CadastroStatusOcorrencia {
	InterfaceStatusOcorrencia interfaceStatusOcorrencia = new RepositorioStatusOcorrencia();
	public void inserirStatusOcorrencia(StatusOcorrencia statusOcorrencia) throws ClassNotFoundException, SQLException{
		interfaceStatusOcorrencia.inserirStatusOcorrencia(statusOcorrencia);
	}

}
