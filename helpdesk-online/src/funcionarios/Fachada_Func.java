package funcionarios;

import java.util.Collection;

import exception.Matricula_nao_encontrada;
import exception.Matricula_vazia;
import exception.Nome_Vazio;

public class Fachada_Func {

	private Cadastro_Func c = new Cadastro_Func();
	
	public void inserir(String nome,String matricula,String telefone, String endereco,String funcao) throws Nome_Vazio, Matricula_vazia{
		
		Funcionario func = new Funcionario();
		
		func.setNome(nome);
		func.setMatricula(matricula);
		func.setTelefone(telefone);
		func.setEndereco(endereco);
		func.setFuncao(funcao);
		
		c.inserir(func);
		
	}
	
	
	public Funcionario pesquisar(String matricula) throws Matricula_nao_encontrada{
		
		return c.pesquisar(matricula);
		
	}
	
	public void excluir(String matricula) throws Matricula_nao_encontrada{
		c.excluir(matricula);
	}
	
	public  Collection<Funcionario> todos(){
		return c.todos(); 
		
	}
}
