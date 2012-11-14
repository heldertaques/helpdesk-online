package exception;

public class Matricula_vazia extends Exception{
	
	private static final long serialVersionUID = 820518869898703320L;

	public Matricula_vazia(){
		
		super("Matricula não informada");
	}

}
