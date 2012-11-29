package equipamento;

import java.sql.SQLException;
import java.util.Collection;

public class CadastroEquipamento {
	private InterfaceEquipamento interfaceEquipamento = new RepositorioEquipamento();
	public void inserirEquipamento(Equipamento equipamento) throws ClassNotFoundException, SQLException{
		interfaceEquipamento.inserirEquipamento(equipamento);
	}
	public Collection<Equipamento> listarEquipamentos() throws ClassNotFoundException, SQLException{
		return interfaceEquipamento.listarEquipamentos();
	}

}
