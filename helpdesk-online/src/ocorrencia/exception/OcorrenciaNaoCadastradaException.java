package ocorrencia.exception;

public class OcorrenciaNaoCadastradaException extends Exception{
	private static final long serialVersionUID = 1L;

	public OcorrenciaNaoCadastradaException(){
		super("Ocorrencia n�o encontrada");
	}
}
