package equipamento.exception;

public class NomeEquipamentoVazioException extends Exception{
	private static final long serialVersionUID = 1L;

	public NomeEquipamentoVazioException(){
		super("O nome do equipamento deve ser preenchido");
	}

}
