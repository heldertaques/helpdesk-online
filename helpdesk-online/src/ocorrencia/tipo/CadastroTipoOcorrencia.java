package ocorrencia.tipo;

import java.sql.SQLException;

public class CadastroTipoOcorrencia {
	InterfaceTipoOcorrencia interfaceTpOcorrencia = new RepositorioTipoOcorrencia();
	public void inserirTipoOcorrencia(TipoOcorrencia tipoOcorrencia) throws ClassNotFoundException, SQLException{
		interfaceTpOcorrencia.inserirTipoOcorrencia(tipoOcorrencia);
	}

}
