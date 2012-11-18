package cargo;

import java.sql.SQLException;

public class CadastroCargo {
	private InterfaceCargo interfaceCargo = new RepositorioCargo();
	public void inserirCargo(Cargo cargo){
		interfaceCargo.inserirCargo(cargo);
	}
	public Integer pesquisarProximoCodCargo() throws ClassNotFoundException, SQLException{
		return interfaceCargo.pesquisarProximoCodCargo();
	}
}
