package setor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCadastroSetor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroSetor() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaSetor fachadaSetor = new FachadaSetor();
		try {
			fachadaSetor.inserirSetor(request.getParameter("setor"), request.getParameter("gerente"));
			response.sendRedirect("CadastroSetor.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
