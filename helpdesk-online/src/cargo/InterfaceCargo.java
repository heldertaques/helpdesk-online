package cargo;

import java.sql.SQLException;

public interface InterfaceCargo {
	public void inserirCargo(Cargo cargo);
	public Integer pesquisarProximoCodCargo() throws ClassNotFoundException, SQLException;
}
