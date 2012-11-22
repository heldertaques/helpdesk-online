package funcionarios;

import java.util.Collection;

import javax.swing.JOptionPane;

public class Executar_Func {

	
	public static void main(String[] args) {
	
	Fachada_Func f = new Fachada_Func();
	
	try {
		
	//f.inserir("carlos", "87788291", "rua do arame","kkkkkk","m", "34251618192", "ytytytyty", "abreu", "centro");
	
	listar(f.todos());
	
	//System.out.println(f.pesquisar("anne").getNome());
	
	//f.excluir("carlos");
	
	//System.out.println(f.pesquisar("carlos").getNome());
	
	
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		
	}	

	}
	
	public static void listar(Collection<Funcionario> todos){
		
		for (Funcionario funcionario : todos) {
			
		    System.out.println(funcionario.getMatricula());
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getTelefone());
			System.out.println(funcionario.getEndereco());
			System.out.println(funcionario.getFuncao());
			System.out.println(funcionario.getSexo());
			System.out.println(funcionario.getCpf());
			System.out.println(funcionario.getEmail());
			System.out.println(funcionario.getCidade());
			System.out.println(funcionario.getBairro());
		}
	}

}
