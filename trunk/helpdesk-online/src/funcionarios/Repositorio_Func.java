package funcionarios;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Repositorio_Func implements Irepositorio {
	
//	private static Collection<Funcionario> lista  = new LinkedList<Funcionario>();
	private static ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
	
	
	public void inserir(Funcionario func) {
		lista.add(func);
		
	}

	public Funcionario pesquisar(String nome) {
	
		
		Funcionario func = new Funcionario();
		
		for (Funcionario f :this.lista) {
			if(f.getNome().equals(nome)){
				func = f;
				break;
			}
		}
		return func;
	}

	
	public void excluir(String nome) {
		
		Funcionario func = pesquisar(nome);
		
		this.lista.remove(func);
		
		
	}

	public  Collection<Funcionario> todos() {
		return lista;
	}


	public void editar(Funcionario func) throws ClassNotFoundException,SQLException {
		
			Funcionario funcionario = pesquisar(func.getNome());
			this.lista.set(this.lista.indexOf(funcionario), func);
		}
		
			

	@Override
	public Collection<Funcionario> UsuariosNaoCadastrado()
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	//função que procura o indice do usuario
	
		public int indexUsuario(String nome){
			
			Funcionario func = pesquisar(nome);
			return this.lista.indexOf(func);
		}

		
		public ArrayList<Funcionario> listarTodosFuncionarios()
				throws SQLException, ClassNotFoundException {
		
			return this.lista;
		}		
}
