package equipamento;

import java.sql.SQLException;

public interface InterfaceEquipamento {
	public void inserirEquipamento(Equipamento equipamento) throws ClassNotFoundException, SQLException;
}
