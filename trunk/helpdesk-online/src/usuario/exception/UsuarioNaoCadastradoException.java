package usuario.exception;

public class UsuarioNaoCadastradoException extends Exception{
	private static final long serialVersionUID = 1L;

	public UsuarioNaoCadastradoException(){
		super("Usu�rio n�o cadastrado.");
	}
}
