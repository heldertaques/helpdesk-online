package funcionarios;

public class Executar_Func {

	
	
	public static void main(String[] args) {
	
	Fachada_Func f = new Fachada_Func();
	
	try {
		
	//Funcionario fun = new Funcionario();
	
	//fun = f.pesquisar("3348");
	
	System.out.println(Repositorio_Func.lista.size());
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
	}	

	}

}
