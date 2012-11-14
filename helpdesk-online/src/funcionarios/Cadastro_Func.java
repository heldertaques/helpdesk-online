package funcionarios;

import java.util.Collection;

import exception.Matricula_nao_encontrada;
import exception.Matricula_vazia;
import exception.Nome_Vazio;

public class Cadastro_Func {

	private Irepositorio I = new Repositorio_Func();
	
	
	public void inserir(Funcionario func) throws Nome_Vazio, Matricula_vazia{
		
		if(func.getMatricula().trim().equals("")){
			 throw new Matricula_vazia();
		}else if (func.getNome().trim().equals("")){
			throw new Nome_Vazio();
	//	}else if
	  //         (pesquisar(func.getMatricula()) == null){
		}else{
			I.inserir(func);
		}
	}
	
	@SuppressWarnings("null")
	public Funcionario pesquisar(String matricula) throws Matricula_nao_encontrada{
		
		Funcionario func = null;
		
		if(func.getMatricula().equals("")){
			throw new Matricula_nao_encontrada();
			
		}else {
			func = I.pesquisar(matricula); 
		}
		return func;
		
	}

	public void excluir(String matricula) throws Matricula_nao_encontrada{
		
		if(matricula.trim().equals("")){
			throw new Matricula_nao_encontrada();
		}else if (pesquisar(matricula) == null){
			throw new Matricula_nao_encontrada();
		}else{
			I.excluir(matricula);
		}
	}
	
	public  Collection<Funcionario> todos() {
		return I.todos();
	}
}


