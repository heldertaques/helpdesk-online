package cargo;

import java.sql.SQLException;
import java.util.Collection;

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
	
	public Collection<Cargo> pesquisarTodosCargos() throws ClassNotFoundException, SQLException{
		return cadCargo.pesquisarTodosCargos();
	}
}
