package ocorrencia;

import java.sql.SQLException;

public interface InterfaceOcorrencia {
	public Integer pegarNumeroOcorrencia() throws ClassNotFoundException, SQLException;
	public void inserirOcorrencia(Ocorrencia ocorrencia) throws ClassNotFoundException, SQLException;

}
