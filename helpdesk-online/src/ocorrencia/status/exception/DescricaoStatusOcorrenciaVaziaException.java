package ocorrencia.status.exception;

public class DescricaoStatusOcorrenciaVaziaException extends Exception{
	private static final long serialVersionUID = 1L;

	public DescricaoStatusOcorrenciaVaziaException(){
		super("A descri��o deve ser preenchido");
	}

}
