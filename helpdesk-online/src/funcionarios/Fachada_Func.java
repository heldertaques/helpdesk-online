package funcionarios;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import exception.Funcionario_nao_cadastrado;
import exception.Matricula_nao_encontrada;
import exception.Matricula_vazia;
import exception.Nome_Vazio;

public class Fachada_Func {

	private Cadastro_Func c = new Cadastro_Func();
	
	public void inserir(String nome,String telefone, String endereco,String funcao,String sexo, String cpf,String email,String cidade,String bairro) throws Exception{
		
		int a = Integer.parseInt(funcao);
		
		Funcionario func = new Funcionario();
		
		//func.setMatricula(matricula);
		func.setNome(nome);
		func.setTelefone(telefone);
		func.setEndereco(endereco);
		func.setFuncao(a);
		func.setSexo(sexo);
		func.setCpf(cpf);
		func.setEmail(email);
		func.setCidade(cidade);
		func.setBairro(bairro);
		
		c.inserir(func);
		
	}
	
	

	public Funcionario pesquisar(String nome) throws Matricula_nao_encontrada, Funcionario_nao_cadastrado, ClassNotFoundException, SQLException{
		return c.pesquisar(nome);
		
	}
	
	public void excluir(String nome) throws Matricula_nao_encontrada, Funcionario_nao_cadastrado, ClassNotFoundException, SQLException {
		c.excluir(nome);
	}
	
	public  Collection<Funcionario> todos() throws ClassNotFoundException, SQLException{
		return c.todos(); 
		
	}

	public void editarFuncionario( String nome,String telefone, String endereco,String funcao,String sexo, String cpf,String email,String cidade,String bairro) throws Exception
		
			{

		int a = Integer.parseInt(funcao);
		
		Funcionario func = new Funcionario();
		try {
			//func.setMatricula(matricula);
			func.setNome(nome);
			func.setTelefone(telefone);
			func.setEndereco(endereco);
			func.setFuncao(a);
			func.setSexo(sexo);
			func.setCpf(cpf);
			func.setEmail(email);
			func.setCidade(cidade);
			func.setBairro(bairro);
			c.editar(func);
			
		} catch (NumberFormatException e) {
					
		}
	}


	public Collection<Funcionario> UsuariosNaoCadastrado() throws ClassNotFoundException, SQLException
	{
		return c.UsuariosNaoCadastrados();
	}
	public ArrayList<Funcionario> listarTodosFuncionarios()
			throws SQLException, ClassNotFoundException {
	
		return c.listarTodosFuncionarios();
	}		


}
