package cargo;

public class FachadaCargo {
	
	public void inserirCargo(String codigo, String descricao){
		Cargo cargo = new Cargo();
		CadastroCargo cadCargo = new CadastroCargo();
		
		cargo.setCodigo(Integer.parseInt(codigo));
		cargo.setDescricao(descricao);
		cadCargo.inserirCargo(cargo);
	}
}
