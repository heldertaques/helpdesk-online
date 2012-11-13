package funcionarios;

import java.util.Collection;

public interface Irepositorio {

	public void inserir(Funcionario func);
	public Funcionario pesquisar(String matricula);
	public void excluir(String matricula);
	public  Collection<Funcionario> todos();
}
