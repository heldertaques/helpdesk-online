package usuario.exception;

public class UsuarioSenhaInvalidosException extends Exception{
	private static final long serialVersionUID = 1L;

	public UsuarioSenhaInvalidosException(){
		super("Usuário ou senha inválidos");
	}

}
