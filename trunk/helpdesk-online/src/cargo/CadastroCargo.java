package cargo;

public class CadastroCargo {
	private InterfaceCargo interfaceCargo = new RepositorioCargo();
	public void inserirCargo(Cargo cargo){
		interfaceCargo.inserirCargo(cargo);
	}
}
