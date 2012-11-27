package ocorrencia.tipo;

import java.sql.SQLException;

public interface InterfaceTipoOcorrencia {
	public void inserirTipoOcorrencia(TipoOcorrencia tipoOcorrencia) throws ClassNotFoundException, SQLException;
}
