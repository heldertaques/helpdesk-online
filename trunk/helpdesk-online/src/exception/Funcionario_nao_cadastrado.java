package exception;

public class Funcionario_nao_cadastrado extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 312356559165803091L;

	public Funcionario_nao_cadastrado(){
		
		super("Funcionario não cadastrado");
	}

}
