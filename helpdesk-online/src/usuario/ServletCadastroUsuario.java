package usuario;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaCadastroUsuario cadastroUsuario = new FachadaCadastroUsuario();
		try {
			cadastroUsuario.inserirUsuario(request.getParameter("nome"), request.getParameter("loginName"),
					request.getParameter("senha"), request.getParameter("privilegio"), request.getParameter("status"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
