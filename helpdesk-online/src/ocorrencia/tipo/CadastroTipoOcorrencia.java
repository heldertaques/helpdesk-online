package ocorrencia.tipo;

import java.sql.SQLException;
import java.util.Collection;

public class CadastroTipoOcorrencia {
	InterfaceTipoOcorrencia interfaceTpOcorrencia = new RepositorioTipoOcorrencia();
	public void inserirTipoOcorrencia(TipoOcorrencia tipoOcorrencia) throws ClassNotFoundException, SQLException{
		interfaceTpOcorrencia.inserirTipoOcorrencia(tipoOcorrencia);
	}
	public Collection<TipoOcorrencia> listarTipoOcorrencias() throws ClassNotFoundException, SQLException{
		return interfaceTpOcorrencia.listarTipoOcorrencias();
	}
}
