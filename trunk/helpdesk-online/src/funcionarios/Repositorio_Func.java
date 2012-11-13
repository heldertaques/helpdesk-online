package funcionarios;

import java.util.Collection;
import java.util.LinkedList;

public class Repositorio_Func implements Irepositorio {
	
	private Collection<Funcionario> lista = new LinkedList<Funcionario>();

	
	public void inserir(Funcionario func) {
		lista.add(func);
		
	}

	public Funcionario pesquisar(String matricula) {
		
		Funcionario func = new Funcionario();
		
		for (Funcionario funcs :this.lista) {
			if(funcs.getMatricula().equals(matricula)){
				func = funcs;
				break;
			}
		}
		return func;
	}

	
	public void excluir(String matricula) {
		
		Funcionario funcs = pesquisar(matricula);
		
		this.lista.remove(funcs);
		
		
	}

	public  Collection<Funcionario> todos() {
		return lista;
	}
}
