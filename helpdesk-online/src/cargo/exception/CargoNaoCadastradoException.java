package cargo.exception;

public class CargoNaoCadastradoException extends Exception{
	private static final long serialVersionUID = 1L;

	public CargoNaoCadastradoException(){
		super("Cargo não cadastrado");
	}

}
