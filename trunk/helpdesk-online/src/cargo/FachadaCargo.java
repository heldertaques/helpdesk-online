package cargo;

import java.sql.SQLException;

public class FachadaCargo {
	CadastroCargo cadCargo = new CadastroCargo();
	
	public void inserirCargo(String codigo, String descricao) throws ClassNotFoundException, SQLException{
		Cargo cargo = new Cargo();
		
		cargo.setCodigo(Integer.parseInt(codigo));
		cargo.setDescricao(descricao);
		cadCargo.inserirCargo(cargo);
	}
	public Integer pesquisarProximoCodCargo() throws ClassNotFoundException, SQLException{
		
		return cadCargo.pesquisarProximoCodCargo();
	}
}
