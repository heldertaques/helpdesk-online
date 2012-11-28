package ocorrencia.tipo;

import java.sql.SQLException;
import java.util.Collection;

public class CadastroTipoOcorrencia {
	private InterfaceTipoOcorrencia interfaceTpOcorrencia = new RepositorioTipoOcorrencia();
	public void inserirTipoOcorrencia(TipoOcorrencia tipoOcorrencia) throws ClassNotFoundException, SQLException{
		interfaceTpOcorrencia.inserirTipoOcorrencia(tipoOcorrencia);
	}
	public Collection<TipoOcorrencia> listarTipoOcorrencias() throws ClassNotFoundException, SQLException{
		return interfaceTpOcorrencia.listarTipoOcorrencias();
	}
	public void alterarTipoOcorrencia(TipoOcorrencia tipoOcorrencia) throws ClassNotFoundException, SQLException{
		interfaceTpOcorrencia.alterarTipoOcorrencia(tipoOcorrencia);
	}
}
