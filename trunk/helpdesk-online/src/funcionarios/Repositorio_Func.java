package funcionarios;

import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

public class Repositorio_Func implements Irepositorio {
	
	private static Collection<Funcionario> lista  = new LinkedList<Funcionario>();
	
	
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


	public void editar(Funcionario func) throws ClassNotFoundException,SQLException {
		
			Funcionario funcionario = pesquisar(func.getMatricula());
			((LinkedList<Funcionario>) this.lista).set(((LinkedList<Funcionario>) this.lista).indexOf(funcionario), func);
		}
		
			

	@Override
	public Collection<Funcionario> UsuariosNaoCadastrado()
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	//função que procura o indice do usuario
	
		public int indexUsuario(String matricula){
			
			Funcionario func = pesquisar(matricula);
			return ((LinkedList<Funcionario>) this.lista).indexOf(func);
		}		
}
