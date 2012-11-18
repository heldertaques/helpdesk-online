package cargo;

import java.sql.SQLException;

public interface InterfaceCargo {
	public void inserirCargo(Cargo cargo) throws ClassNotFoundException, SQLException;
	public Integer pesquisarProximoCodCargo() throws ClassNotFoundException, SQLException;
}
