package ocorrencia.tipo.exception;

public class SlaNaoDefinidoException extends Exception{
	private static final long serialVersionUID = 1L;

	public SlaNaoDefinidoException(){
		super("O SLA n�o foi definido");
	}

}
