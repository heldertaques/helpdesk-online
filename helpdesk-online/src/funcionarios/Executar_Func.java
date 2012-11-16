package funcionarios;

public class Executar_Func {

	
	
	public static void main(String[] args) {
	
	Fachada_Func f = new Fachada_Func();
	
	try {
		
	
	f.inserir("carlos", "3349", "8778-8291", "rua do arame","operador universal","","","","","");
	f.inserir("adriano", "3348", "8778-8291", "rua do arame","operador universal","","","","","");
	f.inserir("expedito", "3350", "8778-8291", "rua do arame","operador universal","","","","","");

	//Funcionario fun = new Funcionario();
	
	//fun = f.pesquisar("3348");
	
	System.out.println(Repositorio_Func.lista.size());
	
	} catch (Exception e) {
		System.out.println(e.getMessage());	
		
	}	

	}

}
