package funcionarios;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletListarFuncionarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletListarFuncionarios() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Fachada_Func lista = new Fachada_Func();
		Collection<Funcionario> listaFunc = new LinkedList<Funcionario>();
		 
		try {
			
			listaFunc = lista.todos();
			  
			request.getSession().setAttribute("listaF", listaFunc);
			response.sendRedirect("listarTodosFuncionarios.jsp");
			System.out.println(listaFunc.size());
			
		} catch (ClassNotFoundException e) {
			//pagina = "erro.jsp";
			//request.setAttribute("msg",e.getMessage() );

			e.printStackTrace();
		} catch (SQLException e) {
			//pagina = "erro.jsp";
			//request.setAttribute("msg",e.getMessage() );
		}
			
		//response.sendRedirect(pagina);


	}

}
