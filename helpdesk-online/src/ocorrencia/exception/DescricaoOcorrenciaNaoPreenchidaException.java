package ocorrencia.exception;

public class DescricaoOcorrenciaNaoPreenchidaException extends Exception{
	private static final long serialVersionUID = 1L;

	public DescricaoOcorrenciaNaoPreenchidaException(){
		super("A descric�o da ocorr�ncia deve ser preenchida");
	}

}
