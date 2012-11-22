package cargo;

import java.sql.SQLException;
import java.util.Collection;

public class Executar {

	/**
	 * @param args
	 * @throws  
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {
		
		
		FachadaCargo fc = new FachadaCargo();
		
		try {
			//fc.inserirCargo("8", "contabilidade");
			listar(fc.pesquisarTodosCargos());
		//	System.out.println(fc.pesquisarTodosCargos());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



public static void listar(Collection<Cargo>todos){
	
	    for (Cargo c : todos) {
		
		System.out.println(c.getCodigo());
		System.out.println(c.getDescricao());
	}
}
}