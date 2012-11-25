package usuario;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAlterarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletAlterarUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaCadastroUsuario fachadaUsuario = new FachadaCadastroUsuario();
	try {
		fachadaUsuario.alterarUsuario(request.getParameter("codigo"), request.getParameter("loginName"), request.getParameter("tipoAcesso"), request.getParameter("status"));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
