package ocorrencia;

import java.sql.SQLException;

public class CadastroOcorrencia {
	private InterfaceOcorrencia interfaceOcorrencia = new RepositorioOcorrencia();
	
	public Integer pegarNumeroOcorrencia() throws ClassNotFoundException, SQLException{
		return interfaceOcorrencia.pegarNumeroOcorrencia();
	}
	public void inserirOcorrencia(Ocorrencia ocorrencia) throws ClassNotFoundException, SQLException{
		interfaceOcorrencia.inserirOcorrencia(ocorrencia);
	}
}
