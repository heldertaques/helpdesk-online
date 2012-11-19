package usuario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPesquisarTodosUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPesquisarTodosUsuarios() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaCadastroUsuario fachadaUsuario = new FachadaCadastroUsuario();
		Collection<Usuario> listaUsuario = new LinkedList<Usuario>();
		try {
			listaUsuario = fachadaUsuario.pesquisarTodosUsuarios();
			request.getSession().setAttribute("listaUsuario", listaUsuario);
			response.sendRedirect("ListaDeUsuarios.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
