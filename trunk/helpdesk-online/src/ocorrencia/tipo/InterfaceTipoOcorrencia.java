package ocorrencia.tipo;

import java.sql.SQLException;
import java.util.Collection;

public interface InterfaceTipoOcorrencia {
	public void inserirTipoOcorrencia(TipoOcorrencia tipoOcorrencia) throws ClassNotFoundException, SQLException;
	public Collection<TipoOcorrencia> listarTipoOcorrencias() throws ClassNotFoundException, SQLException;
	public void alterarTipoOcorrencia(TipoOcorrencia tipoOcorrencia) throws ClassNotFoundException, SQLException;
}
