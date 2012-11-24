package funcionarios;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAlterarFuncionarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletAlterarFuncionarios() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Fachada_Func alterar = new Fachada_Func();
		
		try {
			alterar.editarFuncionario(request.getParameter("nome"),request.getParameter("telefone"),
			         request.getParameter("endereco"),request.getParameter("funcao"),request.getParameter("sexo"),
			         request.getParameter("cpf"),request.getParameter("email"),request.getParameter("cidade"),
			         request.getParameter("bairro"));
			
			response.sendRedirect("AlterarFuncionario.jsp");

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}