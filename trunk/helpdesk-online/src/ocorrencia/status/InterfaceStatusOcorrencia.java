package ocorrencia.status;

import java.sql.SQLException;
import java.util.Collection;

public interface InterfaceStatusOcorrencia {
	public void inserirStatusOcorrencia(StatusOcorrencia statusOcorrencia) throws ClassNotFoundException, SQLException;
	public Collection<StatusOcorrencia> listarStatusOcorrencia() throws ClassNotFoundException, SQLException;
}
