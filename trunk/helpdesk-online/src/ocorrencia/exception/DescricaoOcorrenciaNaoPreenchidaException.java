package ocorrencia.exception;

public class DescricaoOcorrenciaNaoPreenchidaException extends Exception{
	private static final long serialVersionUID = 1L;

	public DescricaoOcorrenciaNaoPreenchidaException(){
		super("A descricão da ocorrência deve ser preenchida");
	}

}
