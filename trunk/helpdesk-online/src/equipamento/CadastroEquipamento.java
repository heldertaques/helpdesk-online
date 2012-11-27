package equipamento;

import java.sql.SQLException;

public class CadastroEquipamento {
	private InterfaceEquipamento interfaceEquipamento = new RepositorioEquipamento();
	public void inserirEquipamento(Equipamento equipamento) throws ClassNotFoundException, SQLException{
		interfaceEquipamento.inserirEquipamento(equipamento);
	}

}
