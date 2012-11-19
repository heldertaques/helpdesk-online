package cargo;

import java.sql.SQLException;
import java.util.Collection;

public interface InterfaceCargo {
	
	public void inserirCargo(Cargo cargo) throws ClassNotFoundException, SQLException;
	public Integer pesquisarProximoCodCargo() throws ClassNotFoundException, SQLException;
	public Collection<Cargo> pesquisarTodosCargos() throws ClassNotFoundException, SQLException;
}
