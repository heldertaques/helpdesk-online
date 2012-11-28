package ocorrencia.tipo;

import java.sql.SQLException;
import java.util.Collection;

public class FachadaTipoOcorrencia {
	private CadastroTipoOcorrencia cadTipoOcorrencia = new CadastroTipoOcorrencia();
	public void inserirTipoOcorrencia(String descricao, String sla) throws ClassNotFoundException, SQLException{
		TipoOcorrencia tipoOcorrencia = new TipoOcorrencia();
		tipoOcorrencia.setDescricao(descricao);
		tipoOcorrencia.setSla(sla);
		cadTipoOcorrencia.inserirTipoOcorrencia(tipoOcorrencia);
	}
	public Collection<TipoOcorrencia> listarTipoOcorrencia() throws ClassNotFoundException, SQLException{
		return cadTipoOcorrencia.listarTipoOcorrencias();
	}
	public void alterarTipoOcorrencia(String codigo, String descricao, String sla) throws ClassNotFoundException, SQLException{
		TipoOcorrencia tipoOcorrencia = new TipoOcorrencia();
		tipoOcorrencia.setCodigo(Integer.parseInt(codigo));
		tipoOcorrencia.setDescricao(descricao);
		tipoOcorrencia.setSla(sla);
		cadTipoOcorrencia.alterarTipoOcorrencia(tipoOcorrencia);
	}
}
