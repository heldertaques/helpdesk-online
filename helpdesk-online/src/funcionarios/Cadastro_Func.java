package funcionarios;

import java.sql.SQLException;
import java.util.Collection;


import exception.Funcionario_nao_cadastrado;
import exception.Matricula_nao_encontrada;

import exception.Matricula_nao_encontrada;

import exception.Matricula_vazia;
import exception.Nome_Vazio;

public class Cadastro_Func {

	private Irepositorio I = new Repositorio_Banco();
	
	
	public void inserir(Funcionario func) throws Nome_Vazio, Matricula_vazia, ClassNotFoundException, SQLException{
		
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
	

	public Funcionario pesquisar(String matricula) throws Matricula_nao_encontrada, Funcionario_nao_cadastrado, ClassNotFoundException, SQLException {
		
		Funcionario func = null;
	
		if(matricula.equals("")){
		
		if(func.getMatricula().equals("")){
			throw new Matricula_nao_encontrada();
			
		}else {
			
			 func = I.pesquisar(matricula);
			 
			if(func == null){
				
				throw new Funcionario_nao_cadastrado();
			}
		}
		}
		return func;
		
	}


	public void excluir(String matricula) throws Matricula_nao_encontrada, Funcionario_nao_cadastrado, ClassNotFoundException, SQLException {



		
		if(matricula.trim().equals("")){

			
			throw new Matricula_nao_encontrada();
			



		}else if (pesquisar(matricula) == null){

			
			throw new Matricula_nao_encontrada();



		}else{
			I.excluir(matricula);
		}
	}
	
	public  Collection<Funcionario> todos() throws ClassNotFoundException, SQLException {
		return I.todos();
	}
}


