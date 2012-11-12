package usuario;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaCadastroUsuario fc = new FachadaCadastroUsuario();
		Usuario u = new Usuario();
		try {
			u = fc.pesquisarPorLogin(request.getParameter("user"),request.getParameter("pass"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String senha = request.getParameter("pass");
		
		TestaSenhaMd5 md5 = new TestaSenhaMd5();
		String senhaMd5 = md5.md5(senha); 
		
		if(senhaMd5.equals(u.getSenha())) {
			System.out.println("Senha válida");
			response.sendRedirect("Principal.jsp");
		}
		
	}

}
