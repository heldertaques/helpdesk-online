package equipamento;

import java.sql.SQLException;
import java.util.Collection;

public interface InterfaceEquipamento {
	public void inserirEquipamento(Equipamento equipamento) throws ClassNotFoundException, SQLException;
	public Collection<Equipamento> listarEquipamentos() throws ClassNotFoundException, SQLException;
}
