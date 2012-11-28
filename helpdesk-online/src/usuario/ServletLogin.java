package usuario;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import usuario.exception.UsuarioSenhaInvalidosException;

public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLogin() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
    	try {
			doPost(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaCadastroUsuario fc = new FachadaCadastroUsuario();
		Usuario u = new Usuario();
		try {
			u = fc.pesquisarPorLogin(request.getParameter("user"),request.getParameter("pass"));
			String senha = request.getParameter("pass");
			TestaSenhaMd5 md5 = new TestaSenhaMd5();
			String senhaMd5 = md5.md5(senha);
			String senhaUsuario = u.getSenha();
			if(senhaMd5.equals(senhaUsuario)) {
				request.getSession().setAttribute("logado", u);
				response.sendRedirect("Principal.jsp");
			}else{
				throw new UsuarioSenhaInvalidosException();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (UsuarioSenhaInvalidosException e) {
			request.getSession().setAttribute("msg", e.getMessage());
			response.sendRedirect("FalhaLogin.jsp");
		}
	}
}
