package equipamento;

import java.sql.SQLException;
import java.util.Collection;

public class FachadaEquipamento {
	private CadastroEquipamento cadEquipamento = new CadastroEquipamento();
	public void inserirEquipamento(String descricao) throws ClassNotFoundException, SQLException{
		Equipamento equipamento = new Equipamento();
		equipamento.setDescricao(descricao);
		cadEquipamento.inserirEquipamento(equipamento);
	}
	public Collection<Equipamento> listarEquipamentos() throws ClassNotFoundException, SQLException{
		return cadEquipamento.listarEquipamentos();
	}
}
