package funcionarios;

import javax.swing.JOptionPane;

public class Executar_Func {

	
	
	public static void main(String[] args) {
	
	Fachada_Func f = new Fachada_Func();
	
	try {
		
	
	f.inserir("carlos", "3349", "8778-8291", "rua do arame","operador universal");
	
    f.pesquisar("3349");
	
	f.excluir("3349");
	
	} catch (Exception e) {
		System.out.println(e.getMessage());	
		
	}	

	}

}
