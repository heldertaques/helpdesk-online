package setor;

import java.sql.SQLException;

public class CadastroSetor {
	private InterfaceSetor interfaceSetor = new RepositorioSetor(); 
	public void inserirSetor(Setor setor) throws ClassNotFoundException, SQLException{
		interfaceSetor.inserirSetor(setor);
	}
}
