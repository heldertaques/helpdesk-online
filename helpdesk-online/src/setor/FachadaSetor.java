package setor;

import java.sql.SQLException;

public class FachadaSetor {
	private CadastroSetor cadastroSetor = new CadastroSetor(); 
	public void inserirSetor(String nome, String gerente) throws ClassNotFoundException, SQLException{
		Setor setor = new Setor();
		setor.setNomeSetor(nome);
		setor.setGerente(Integer.parseInt(gerente));
		cadastroSetor.inserirSetor(setor);
	}
}
