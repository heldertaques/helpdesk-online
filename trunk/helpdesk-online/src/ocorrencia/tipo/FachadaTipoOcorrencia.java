package ocorrencia.tipo;

import java.sql.SQLException;

public class FachadaTipoOcorrencia {
	CadastroTipoOcorrencia cadTipoOcorrencia = new CadastroTipoOcorrencia();
	public void inserirTipoOcorrencia(String descricao, String sla) throws ClassNotFoundException, SQLException{
		TipoOcorrencia tipoOcorrencia = new TipoOcorrencia();
		tipoOcorrencia.setDescricao(descricao);
		tipoOcorrencia.setSla(sla);
		cadTipoOcorrencia.inserirTipoOcorrencia(tipoOcorrencia);
	}

}
