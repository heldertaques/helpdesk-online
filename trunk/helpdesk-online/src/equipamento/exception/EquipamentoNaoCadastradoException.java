package equipamento.exception;

public class EquipamentoNaoCadastradoException extends Exception{
	private static final long serialVersionUID = 1L;

	public EquipamentoNaoCadastradoException(){
		super("Equipamento não cadastrado");
	}

}
