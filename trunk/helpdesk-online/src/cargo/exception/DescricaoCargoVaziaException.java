package cargo.exception;

public class DescricaoCargoVaziaException extends Exception{

	private static final long serialVersionUID = 1L;
	public DescricaoCargoVaziaException(){
		super("A descrição do cargo deve ser preenchida");
	}

}
