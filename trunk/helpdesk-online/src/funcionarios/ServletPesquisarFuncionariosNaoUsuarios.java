package funcionarios;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPesquisarFuncionariosNaoUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPesquisarFuncionariosNaoUsuarios() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Collection<Funcionario> listaFunc = (Collection<Funcionario>) new  LinkedList<Funcionario>();
		Fachada_Func ff = new Fachada_Func();
		
		try {
			listaFunc = ff.UsuariosNaoCadastrado();
			request.getSession().setAttribute("listaFuncionarios", listaFunc);
			response.sendRedirect("FuncionariosCadastrados.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}