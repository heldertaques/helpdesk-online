package ocorrencia.tipo.exception;

public class TipoDeOcorrenciaVazioException extends Exception{
	private static final long serialVersionUID = 1L;

	public TipoDeOcorrenciaVazioException(){
		super("O a descri��o do tipo deve ser preenchida");
	}

}
