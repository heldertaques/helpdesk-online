package funcionarios;

import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;


import exception.Funcionario_nao_cadastrado;
import exception.Matricula_nao_encontrada;

import exception.Matricula_nao_encontrada;

import exception.Matricula_vazia;
import exception.Nome_Vazio;

public class Cadastro_Func {

	private Irepositorio I = new Repositorio_Banco();
	
	
	public void inserir(Funcionario func) throws Exception{
		
		/*if(func.getMatricula().trim().equals("")){
			 throw new Matricula_vazia();*/
		
		if (func.getNome().trim().equals("")){
			throw new Nome_Vazio();
	//	}else if
	  //         (pesquisar(func.getMatricula()) == null){
		}else{
			I.inserir(func);
		}
	}
	

	public Funcionario pesquisar(String matricula) throws Matricula_nao_encontrada, Funcionario_nao_cadastrado, ClassNotFoundException, SQLException {
		
      
		Funcionario func = this.I.pesquisar(matricula);
	
		if(matricula.trim().equals("")){
			throw new Matricula_nao_encontrada();
			
		}else if(func == null){
			
			throw new Funcionario_nao_cadastrado();		 
			
			}
		return func;
		}
		
		
		
	
		//return null;
	

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
		return this.I.todos();
	}

	
	public void editar(Funcionario func) throws ClassNotFoundException, SQLException, Matricula_nao_encontrada, Funcionario_nao_cadastrado{
		
		if(pesquisar(func.getMatricula()) == null){
		   throw new Matricula_nao_encontrada();
		}else if(func.getMatricula().trim().isEmpty()){
			throw new Matricula_nao_encontrada();
		}else{
			I.editar(func);
		}
	}


	public Collection<Funcionario> UsuariosNaoCadastrados() throws ClassNotFoundException, SQLException
	{
		Collection<Funcionario> listaFunc = new LinkedList<Funcionario>();
		listaFunc = I.UsuariosNaoCadastrado();
		return listaFunc;
	}
}


